

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Logindata")
public class Logindata extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session =request.getSession();
		Connection myconnection = null;
		String usern = request.getParameter("username");
		String userp = request.getParameter("userpass");
		System.out.println(usern);
		System.out.println(userp);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps=myconnection.prepareStatement("select * from users where username = ? and userspass = ?");
			ps.setString(1, usern);
			ps.setString(2, userp);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				session.setAttribute(usern, "un");
				session.setAttribute(userp, "up");
				RequestDispatcher myDispatcher =request.getRequestDispatcher("index.jsp");
				myDispatcher.include(request, response);
			}
			else {
				response.getWriter().print("nope");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				myconnection.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
