package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.UseDemo;


@WebServlet("/FetchingAllRecords") // this name has to be the same in jsp <form action =" "
public class FetchinAllRecordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	//Business logic here
		
		try {
			// step 1 register Driver Class
			Class.forName("com.mysql.jdbc.Driver");		
			
			try { 
				//step 2 create Connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/raje_db","root", "Realmadrid123");
			 
				// Step 3. Create a Statement
				PreparedStatement ps = conn.prepareStatement("select * from profile");//fetch all records here
				
				// 4. Execute query
				// fetch the record/retrieval
				ResultSet rs = ps.executeQuery();//executeQuery always return instance of ResultSet 
				List<UseDemo> userList= new ArrayList<>();//blank arraylist//list of data
				while(rs.next()) {
					
					String username = rs.getString(1);
					String password =rs.getString(2);
					String fullname =rs.getString(3);
					String email =rs.getString(4);
					String address =rs.getString(5);
					
					UseDemo userObj = new UseDemo(username,password,fullname,email,address);//holding the data of obje
				userList.add(userObj);//in first iteration fisrt object will be added in the blank arrayList.
				//and in second iteration , second object will be added to the arrayLIst
				}
				
				request.setAttribute("userList", userList);//
				System.out.println(userList);//print all the objects on console side
				//if we want to forward it to client on showall page, then we have to use getRequestDispatcher class
				request.getRequestDispatcher("showAll.jsp").forward(request, response);//client will see the result on showAll page
					
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
