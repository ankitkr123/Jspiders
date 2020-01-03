package LoginRegisteration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		ServletContext context = getServletContext();
		String name = (String) context.getAttribute("name");
		String dob = (String) context.getAttribute("dob");
		String address = (String) context.getAttribute("address");
		String contact = (String) context.getAttribute("contact");
		if (name == null) {
			pw.print("Please login ");
			
		} else {
			pw.print("name "+name);
			pw.print("DOB "+dob);
			pw.print("Address"+address);
			pw.print("Contact "+contact);

		}
		
		
		
		
	}

}
