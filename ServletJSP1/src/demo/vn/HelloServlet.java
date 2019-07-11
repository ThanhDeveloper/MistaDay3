package demo.vn;

import java.io.IOException;
//import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.xml.ws.Response;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Dam bao 1 instance duy nhat
	private String email;
	
	public HelloServlet() {
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.email=config.getInitParameter("email");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out=resp.getOutputStream();
		String password=this.getServletConfig().getInitParameter("pass");
		/*out.print("<html>");
		out.print("<head>This is first Servlet Hello</head>");
		out.print("<body>");
		out.print("<H1>Runnings</H1>");
		
		out.println("My Email: "+this.email);
		out.println("Password :"+password);
		out.print("</body>");
		out.print("</html>");*/
		RequestDispatcher dispatcher= req.getServletContext().getRequestDispatcher("ServletJSP1/index.html");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
}
