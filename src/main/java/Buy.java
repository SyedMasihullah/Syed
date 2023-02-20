


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/Buy")
public class Buy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String category = request.getParameter("Category");
		System.out.println(category);
		if (category.equalsIgnoreCase("Mobile")) {
			cMobile(request, response);
		}
		if (category.equalsIgnoreCase("Laptop")) {
			cLaptop(request, response);
		}
		if (category.equalsIgnoreCase("Software")) {
			cSoftware(request, response);
		}
		
	}
	
	protected void cMobile(HttpServletRequest request, HttpServletResponse response)
	{
		String proid = request.getParameter("pid");
		String product = request.getParameter("pn");
		Connection myconnection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps =myconnection.prepareStatement("delete from mobiles where Product = ? and Proid = ?");
			ps.setString(2, proid);
			ps.setString(1, product);
			
			int r = ps.executeUpdate();
			if (r>0) {
				response.getWriter().print(proid+product+"  has been Removed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				myconnection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	protected void cLaptop(HttpServletRequest request, HttpServletResponse response)
	{
		String proid = request.getParameter("pid");
		String product = request.getParameter("pn");
		Connection myconnection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps =myconnection.prepareStatement("delete from laptops where Product = ? and Proid = ?");
			ps.setString(2, proid);
			ps.setString(1, product);
			
			int r = ps.executeUpdate();
			if (r>0) {
				response.getWriter().print(proid+product+"  has been Removed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				myconnection.close();
			} catch (Exception e2) {
			}
		}
	}
	
	protected void cSoftware(HttpServletRequest request, HttpServletResponse response)
	{
		String proid = request.getParameter("pid");
		String product = request.getParameter("pn");
		Connection myconnection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
			PreparedStatement ps =myconnection.prepareStatement("delete from softwares where Product = ? and Proid = ?");
			ps.setString(2, proid);
			ps.setString(1, product);
	
			int r = ps.executeUpdate();
			if (r>0) {
				response.getWriter().print(proid+product+"  has been Removed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				myconnection.close();
			} catch (Exception e2) {

			}
		}
	}
}

