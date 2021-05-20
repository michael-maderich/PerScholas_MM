import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo")
public class MyServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String mymsg;
	
	public void init() throws ServletException {
		mymsg = "Hello World!";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Writing message to the webpage
		PrintWriter out = response.getWriter();
		out.println("<h1>" + mymsg + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = "haseeb";
		String p = "123";
		String username = request.getParameter("myname");
		String password = request.getParameter("password");
		// Setting up the content of webpage
		response.setContentType("text/html");
		
		if (u.equals(username) && p.equals(password)) {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			RequestDispatcher rd = request.getRequestDispatcher("/fail.jsp");
			rd.forward(request, response);
		}

		PrintWriter pw = response.getWriter();
		pw.print("<html>\n\t<head>");
		pw.print("\n\t\t<title>Welcome to the Web World</title>\n\t</head>");
		pw.println("\n\t<body>\n\t\t<h2> username is :" + username + "</h2>");
		pw.println("\t\t<h2> password is :" + password + "</h2>");
		pw.println("\t</body>\n</html>");
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
