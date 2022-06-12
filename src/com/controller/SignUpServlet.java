package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//
public class SignUpServlet extends HttpServlet {
 @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String FirstName = request.getParameter("FirstName");
	 String EmailId = request.getParameter("EmailId");
	 int Age = Integer.parseInt(request.getParameter("Age"));
	 boolean isError = false;
	
	 if(FirstName == null || FirstName.trim().length() == 0)
	 {
		 isError = true;
		 request.setAttribute("FirstNameError", "Please Enter your Name");
	 }
	 else
	 {
		 request.setAttribute("FirstNameValue", FirstName);
	 }
	 
	 if(EmailId == null || EmailId.trim().length() == 0)
	 {
		 isError = true;
		 request.setAttribute("EmailIdError", "Please Enter your EmailId");
	 }
	 else
	 {
		 request.setAttribute("EmailIdValue", EmailId);
	 }
	 
	 if(Age == 0)
	 {
		 isError = true;
		 request.setAttribute("AgeError", "Please Enter valid Age");
	 }
	 else
	 {
		 request.setAttribute("AgeValue", Age +"");
	 }
	 RequestDispatcher rd = null;
	 if(isError == true)
	 {
		 rd = request.getRequestDispatcher("SignUp.jsp");
	 }
	 else
	 {
		 rd = request.getRequestDispatcher("SignUpShowcase.jsp");
	 }
	 
//	 request.setAttribute("EmailId", EmailId);
//	 request.setAttribute("Age", Age);
//	 request.setAttribute("FirstName", FirstName);
//	 RequestDispatcher rd = request.getRequestDispatcher("SignUpShowcase.jsp");
	 rd.forward(request, response);
 }
}
