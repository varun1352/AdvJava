package com.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WordActionsServlet extends HttpServlet {
	static String reverseWords(String str)
    {
  
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
  
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";
  
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String word = request.getParameter("word");
	String format = request.getParameter("format");
	System.out.println(word);
	System.out.println(format);
	boolean isError = false;
	
	if(word == null || word.trim().length() == 0)
	{
		isError = true;
		request.setAttribute("wordError", "please Enter a word");
	}
	else 
	{
		request.setAttribute("wordValue", word);
	}
	
	if(format == "UpperCase")
	{
		word = word.toUpperCase();
		request.setAttribute("wordValue", word);
	}
	if(format == "LowerCase")
	{
		word = word.toLowerCase();
		request.setAttribute("wordValue", word);
	}
	if(format == "Reverse"){
		word = reverseWords(word);
		request.setAttribute("wordValue", word);
	}
	
	System.out.println(word);
	RequestDispatcher rd;
	if(isError == true)
	{
		rd = request.getRequestDispatcher("WordActions.jsp");
	}
	else
	{
		rd = request.getRequestDispatcher("WordResult.jsp");
	}
	rd.forward(request, response);
}
}
