package edu.acc.j2ee.beerv3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BeerSelect extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String color = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> brands = be.getBrands(color);
		request.setAttribute("styles", brands);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}