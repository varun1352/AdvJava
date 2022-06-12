package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int num1 = Integer.parseInt(request.getParameter("Num1"));
	int num2 = Integer.parseInt(request.getParameter("Num2"));
	int result = 0;
	System.out.println(num1);
	System.out.println(num2);
	String Choice = (String)request.getParameter("Radio");
	
	if(Choice.equals("Addition"))
	{
		result = num1 + num2;
	}
	else if(Choice.equals("Subtraction"))
	{
		result = num1 - num2;
	}
	else if(Choice.equals("Multiplication"))
	{
		result = num1 * num2;
	}
	else if(Choice.equals("Division"))
	{
		result = num1 / num2;
	}
	request.setAttribute("result", result + "");
	RequestDispatcher rd = request.getRequestDispatcher("ResultOfOperation.jsp");
	rd.forward(request, response);
	
}
}
