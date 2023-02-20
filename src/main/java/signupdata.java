

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

@WebServlet("signupdata")
public class signupdata extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session =request.getSession();
		Connection myconnection = null;
		String usern = request.getParameter("regname");
		String userm = request.getParameter("regmail");
		String userc = request.getParameter("regmobile");
		String userp = request.getParameter("regpass");
		System.out.println(usern);
		System.out.println(userm);
		System.out.println(userc);
		System.out.println(userp);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps=myconnection.prepareStatement("insert into users(username, usermail, usermob ,userspass) values (?,?,?,?)");
			ps.setString(1, usern);
			ps.setString(2, userm);
			ps.setString(3, userc);
			ps.setString(4, userp);
			int rs = ps.executeUpdate();
			if(rs>0)
			{
				session.setAttribute(usern, "un");
				session.setAttribute(userm, "um");
				response.getWriter().print("hello "+usern+" "+userm+" have been successfully registered!");
				RequestDispatcher myDispatcher =request.getRequestDispatcher("index");
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
