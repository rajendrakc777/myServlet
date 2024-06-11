package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.UseDemo;


@WebServlet("/loginServlet") // this name has to be the same in jsp <form action =" "
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//read the data which are coming from login.jsp
		String name=request.getParameter("username");//text box holding username from jsp
		String pwd=request.getParameter("password");
		
		
	//Business logic here
		
		try {
			// step 1 register Driver Class
			Class.forName("com.mysql.jdbc.Driver");		
			
			try { 
				//step 2 create Connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raje_db","root", "Realmadrid123");
			 
				// Step 3. Create a Statement
				PreparedStatement ps = conn.prepareStatement("select * from profile where username =? and password=?");
				ps.setNString(1, name);
				ps.setNString(2, pwd);
			
				// 4. Execute query
				// fetch the record/retrieval
				ResultSet rs = ps.executeQuery();//executeQuery always return instance of ResultSet 
				if(rs.next()) {
					
					String username = rs.getString(1);
					String password =rs.getString(2);
					String fullname =rs.getString(3);
					String email =rs.getString(4);
					String address =rs.getString(5);
					//we have to store theese data using setAttributes
//					request.setAttribute("username", username);//hold value of username in a 
//					request.setAttribute("password", password);//hold value of password in b
//					request.setAttribute("fullname", fullname);
//					request.setAttribute("email", email);
//					request.setAttribute("address", address);
				
					//no need to create all attributes only 2 lines can cover all 
					UseDemo userObj = new UseDemo(username,password,fullname,email,address);
					request.setAttribute("userObj", userObj);//hold the value of userobj object of UseDemo class.
					//request.getRequestDispatcher("congratulation.jsp").forward(request, response);
					
					request.getRequestDispatcher("tableshow.jsp").forward(request, response);
					System.out.println(rs.getString(1) + " "+ rs.getString(2)+ " "+ rs.getString(3)+ ""+ rs.getString(4)+""+rs.getString(5));
					
				}else {
					request.setAttribute("abc", "Wrong Credential.. Please Re-try");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
