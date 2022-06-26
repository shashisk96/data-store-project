package com.rks.persistcookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/persisturl")
public class AddPersistCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		int age=Integer.parseInt(req.getParameter("age"));
		
		Cookie cookie1=new Cookie("uname",name);
		Cookie cookie2=new Cookie("mail",email);
		Cookie cookie3=new Cookie("pwd",password);
		Cookie cookie4=new Cookie("value",age+"");
		
		cookie1.setMaxAge(3*60);////
		
		
		cookie2.setMaxAge(3*60);
		cookie3.setMaxAge(3*60);
		cookie4.setMaxAge(3*60);
		
		resp.addCookie(cookie1);///
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		resp.addCookie(cookie4);
		
		resp.sendRedirect("gotocookieurl");
	}
}
