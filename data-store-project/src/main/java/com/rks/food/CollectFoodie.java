package com.rks.food;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/addurl")
public class CollectFoodie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("fooditem");
		
		HttpSession session=req.getSession();
		Object obj=session.getAttribute("cart");
		//ArrayList al=(ArrayList)session.getAttribute("cart");
		ArrayList al=new ArrayList();
		if(obj==null) {
			//ArrayList al=new ArrayList();
			al.add(name);
			session.setAttribute("cart", al);
		}else {
			al=(ArrayList)session.getAttribute("cart");
			al.add(name);
			session.setAttribute("cart", al);
		}
		System.out.println(obj);
		RequestDispatcher dispatcher=req.getRequestDispatcher("displayfood.jsp");
		dispatcher.include(req, resp);
	}
}
