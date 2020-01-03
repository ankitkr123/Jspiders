package LoginRegisteration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterationServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String contact = req.getParameter("contact");
		long lcn = 0;
		if (contact.length()==10) {
			lcn=Long.parseLong(contact);
			
		}else {
			pw.print("Enter valid number");
			pw.print("<a href=\"registeration.html\">Register</a>");
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments?user=root&password=root");
			PreparedStatement pst = con.prepareStatement("insert into registeration values(?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, dob);
			pst.setString(3, address );
			pst.setLong(4, lcn);
			pst.execute();
			pw.write("Data inserted successfully");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
