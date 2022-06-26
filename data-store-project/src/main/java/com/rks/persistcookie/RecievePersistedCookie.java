package com.rks.persistcookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/gotocookieurl")
public class RecievePersistedCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies=req.getCookies();
		
		PrintWriter out=resp.getWriter();
		
		for(Cookie cookie:cookies) {
			out.print(cookie.getValue());
		}
		
	}
}
