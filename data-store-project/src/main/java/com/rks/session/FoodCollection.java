package com.rks.session;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/collecturl")
public class FoodCollection extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String product=req.getParameter("item");
		
		HttpSession session=req.getSession();
		
		Object obj=session.getAttribute("eproduct");
		if(obj==null) {
			ArrayList al=new ArrayList();
			al.add(product);
			session.setAttribute("eproduct", al);
		}else {
			ArrayList al=(ArrayList)session.getAttribute("eproduct");
			al.add(product);
			session.setAttribute("eproduct", al);
		}
		System.out.println(obj);
		
		resp.sendRedirect("logsession.html");
	}

	
}
