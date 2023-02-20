
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

@WebServlet("/Read")
public class Read extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String category = request.getParameter("Category");
		System.out.println(category);
		if (category.equalsIgnoreCase("Mobile")) {
			rMobile(request, response);
		}
		if (category.equalsIgnoreCase("Laptop")) {
			rLaptop(request, response);
		}
		if (category.equalsIgnoreCase("Software")) {
			rSoftware(request, response);
		}
		
	}
	
		protected void rMobile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			Connection myconnection=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
				java.sql.Statement sm=myconnection.createStatement();
				ResultSet m = sm.executeQuery("select *from tajir.mobiles");

				while (m.next()) {
					out.println("<style>");
					out.println("body {"
							+"	background-color: #90EE90;"
							+"	margin: device;"
							+"	align: auto;}"
							+"table {"
							+"border-color: red"
							+"background-color: #90EE90;"
							+"color: Blue;"
							+"margin: device;"
							+"padding: 15px;"
							+"align: auto;}"
							+"</style>"
							+"<meta name='viewport' content='width=device-width,initial-scale=1.0'"
							+"charset='UTF-8'>"
							+"<meta name='description' content='products for best price'>"
							+"<meta name='keywords' content='mobile,laptop,Software'>"
							+"<meta name='author' content='Syed Masihullah'>"
							+"<title>List of products</title>");
					out.println("<body>");
					out.println("<table>"
							+ "	<tr><td>'id	: "+m.getString(1)+"</td>"
							+ "	<td>'id	: "+m.getString(2)+"</td>"
							+ "	<td>'id	: "+m.getString(3)+"</td>"
							+ "	<td>'id	: "+m.getString(4)+"</td></tr>");
					out.println("</table>");
					out.println("</body></html>");
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
		
		protected void rLaptop(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			Connection myconnection=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
				java.sql.Statement sl=myconnection.createStatement();
				ResultSet l = sl.executeQuery("select *from tajir.laptops");

				while (l.next()) {
					out.println("<style>");
					out.println("body {"
							+"	background-color: #90EE90;"
							+"	margin: device;"
							+"	align: auto;}"
							+"table {"
							+"border-color: red"
							+"background-color: #90EE90;"
							+"color: Blue;"
							+"margin: device;"
							+"padding: 15px;"
							+"align: auto;}"
							+"</style>"
							+"<meta name='viewport' content='width=device-width,initial-scale=1.0'"
							+"charset='UTF-8'>"
							+"<meta name='description' content='products for best price'>"
							+"<meta name='keywords' content='mobile,laptop,Software'>"
							+"<meta name='author' content='Syed Masihullah'>"
							+"<title>List of products</title>");

					out.println("<table>"
							+ "	<tr><td>'id	: "+l.getString(1)+"</td>"
							+ "	<td>'id	: "+l.getString(2)+"</td>"
							+ "	<td>'id	: "+l.getString(3)+"</td>"
							+ "	<td>'id	: "+l.getString(4)+"</td></tr>");
					out.println("</table>");
					out.println("</body></html>");
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

		protected void rSoftware(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html>");
			Connection myconnection=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tajir","root","Syed@123");
				java.sql.Statement ss=myconnection.createStatement();
				ResultSet s = ss.executeQuery("select *from tajir.softwares");

				while (s.next()) {
					out.println("<style>");
					out.println("body {"
							+"	background-color: #90EE90;"
							+"	margin: device;"
							+"	align: auto;}"
							+"table,td,tr {"
							+"border-color: red"
							+"background-color: #90EE90;"
							+"color: Blue;"
							+"margin: device;"
							+"padding: 15px;"
							+"align: auto;}"
							+"</style>"
							+"<meta name='viewport' content='width=device-width,initial-scale=1.0'"
							+"charset='UTF-8'>"
							+"<meta name='description' content='products for best price'>"
							+"<meta name='keywords' content='mobile,laptop,Software'>"
							+"<meta name='author' content='Syed Masihullah'>"
							+"<title>List of products</title>");
					out.println("<body>");
					out.println("<table>"
							+ "	<tr><td>'id	: "+s.getString(1)+"</td>"
							+ "	<td>'id	: "+s.getString(2)+"</td>"
							+ "	<td>'id	: "+s.getString(3)+"</td>"
							+ "	<td>'id	: "+s.getString(4)+"</td></tr>");
					out.println("</table>");
					out.println("</body></html>");
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
