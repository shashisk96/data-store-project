package com.rks.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/displayurl")
public class Display extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		
		ArrayList al=(ArrayList)session.getAttribute("eproduct");
		
		String name=(String)session.getAttribute("uname");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		for(Object obj: al) {
			out.print("<html><body style='background-color:red'>");
			out.print("<marquee>"+obj+"</marquee><br>");
			out.print("</body></html>");
		}
		out.print(name);
	}
}
