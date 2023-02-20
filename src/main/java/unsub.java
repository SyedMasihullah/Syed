

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("unsub")
public class unsub extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection myconnection = null;
		String usern = request.getParameter("unname");
		String userc = request.getParameter("unmobile");
		String userp = request.getParameter("unpass");
		System.out.println(usern);
		System.out.println(userc);
		System.out.println(userp);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps=myconnection.prepareStatement("delete from users where username = ? and usermob = ? and userspass = ?");
			ps.setString(1, usern);
			ps.setString(2, userc);
			ps.setString(3, userp);
			int rs = ps.executeUpdate();
			if(rs>0)
			{
				response.getWriter().print(usern+" you have been successfully unsubcribed");
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