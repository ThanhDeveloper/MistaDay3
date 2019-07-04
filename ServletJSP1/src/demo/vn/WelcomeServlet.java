package demo.vn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/welcome",initParams= {
		@WebInitParam( name="email",value="abc@yahoo.com"),
		@WebInitParam(name="password",value="123")
})
public class WelcomeServlet  extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out=resp.getOutputStream();
		String email=this.getServletConfig().getInitParameter("email");
		String password=this.getServletConfig().getInitParameter("password");
		out.print("<html>");
		out.print("<head>This is first Servlet Hello</head>");
		out.print("<body>");
		out.print("<H1>Welcome Servlet catch 2</H1>");
		out.print(email);
		out.print(password);
		out.print("</body>");
		out.print("</html>");
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		}
}
