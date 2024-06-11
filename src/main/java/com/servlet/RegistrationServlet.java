package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registrationServlet") // this name has to be the same in jsp <form action =" "
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//read the data which are coming from registration.jsp
		String username=request.getParameter("username");//text box holding username from jsp
		String password=request.getParameter("password");
		String fullname=request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
	//Business logic here
		
		try {
			// step 1 register Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			try { 
				//step 2 create Connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raje_db","root", "Realmadrid123");
			 
				// Step 3. Create a Statement
				PreparedStatement ps = conn.prepareStatement("Insert into profile value(?,?,?,?,?)");
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, fullname);
				ps.setString(4, email);
				ps.setString(5, address);
				// 4. Execute query
				// fetch the record/retrieval
				int recordInserted = ps.executeUpdate();
				if (recordInserted > 0) {
					System.out.println(recordInserted + "Record inserted successfully :");//result shown on console
				}
			request.setAttribute("xyz","Record inserted successfully :" );//result on the client side
			//here "abc" is expression language
			//request.getRequestDispatcher("registration.jsp").forward(request, response);
			//respose will forwarede on the request of jsp page 
			//see the result on tha registration.jsp page here
			request.getRequestDispatcher("registration.jsp").forward(request, response);
					//we want to display the result on info page here
			//xyz holding the value.
					
					
			
			}catch (SQLException e) {
				e.printStackTrace();
			}	
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
