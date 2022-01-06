package com.todomanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todomanager.beans.DateConvertor;


/**
 * Servlet implementation class ToDoManagerServlet
 */
@WebServlet("/ToDoManagerServlet")
public class ToDoManagerServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    { 
    	DateConvertor dateConvertor = DateConvertor.getInstance();
    	PrintWriter out = response.getWriter();
    	out.println("DataConvertor hashcode : "+dateConvertor.hashCode());
    }

}
