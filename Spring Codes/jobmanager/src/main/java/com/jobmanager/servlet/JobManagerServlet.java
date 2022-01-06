package com.jobmanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jobmanager.beans.DateConvertor;

/**
 * Servlet implementation class JobManagerServlet
 */
public class JobManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    { 
    	DateConvertor dateConvertor = DateConvertor.getInstance();
    	PrintWriter out = response.getWriter();
    	out.println("DataConvertor hashcode : "+dateConvertor.hashCode());
    }

}
