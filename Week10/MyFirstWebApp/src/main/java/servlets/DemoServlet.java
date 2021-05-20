package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet(description = "Servlets Exercise 2", urlPatterns = { "/DemoServlet" })
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count=0;
       
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initialized ....value of count is :" + count);
	}

	@Override
	public void destroy() {
		System.out.println("Servlet removed from service....Total visitor count is " + count);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Number :" + count + " is received.");
		count++;
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
