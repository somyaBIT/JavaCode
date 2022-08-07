package myservelet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServelet extends HttpServlet {
	private static final String PrintWriter = null;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		java.io.PrintWriter out = response.getWriter();
		out.println("Welcome to servelet");
	}

}
