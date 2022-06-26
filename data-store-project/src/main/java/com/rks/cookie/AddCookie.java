package com.rks.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookieurl")
public class AddCookie extends HttpServlet {

	private String email;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext context=config.getServletContext();
		email=context.getInitParameter("hello");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("username");
		
		Cookie c=new Cookie("uname", name);
		Cookie c1=new Cookie("em", email);
		resp.addCookie(c1);
		resp.addCookie(c);
		
		resp.sendRedirect("gotourl");
	}
}
