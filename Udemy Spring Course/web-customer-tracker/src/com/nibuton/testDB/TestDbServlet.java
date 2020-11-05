package com.nibuton.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSl=false&serverTimezone=UTC";
		String user = "springstudent";
		String password = "springstudent";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		try(Connection connection = DriverManager.getConnection(url, user, password)){
			
			PrintWriter writer = response.getWriter();
			writer.println("Success!");
			writer.flush();
			
		} catch(SQLException exc){
			throw new RuntimeException(exc);
		}
	}
}
