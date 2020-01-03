package LoginRegisteration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	long lcn;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		ServletContext context = getServletContext();
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		lcn=Long.parseLong(pass);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments?user=root&password=root");
			PreparedStatement pst = con.prepareStatement("Select * from registeration where name= ? and contact = ?");
			pst.setString(1, user);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b) {
				pw.print("<a href=\"login.html\">Login</a>\r\n" + 
						"				<a href=\"registeration.html\">Register</a>\r\n" + 
						"				<a href=\"profile\">Profile</a><a href=\"logout\">Logout</a>");
				
				
				
				context.setAttribute("name", rs.getString(1));
				context.setAttribute("dob", rs.getString(2));
				context.setAttribute("address", rs.getString(3));
				context.setAttribute("contact", rs.getString(4));
				
				
				pw.print("Name "+rs.getString(1)+"<br>"+"DOB"+rs.getString(2)+"<br>"+"Address "+rs.getString(3)+"<br>"+"Contact "+rs.getLong(4)+"<br>");
				
				
			} else {
				pw.print("Invalid username/password please register yourself <a href=\"registeration.html\">Register</a> ");

			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
