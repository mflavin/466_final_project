package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User u = (User) request.getSession(false).getAttribute("regUser");
		String adminP, adminE;

		try {
			adminP = request.getParameter("password2");
			adminE = request.getParameter("email2");

			if (u.getPassword().equals(adminP)&&u.getEmail().equals(adminE)) {
				request.getRequestDispatcher("ProcessCustomer.jsp").forward(request, response);
			}
			else if (adminP.equals("admin")&&adminE.equals("admin")){
				request.getRequestDispatcher("Admin.jsp").forward(request, response);
			}
			else if (u.getPassword().equals(" ") && u.getEmail().equals(" ")) {
				request.getRequestDispatcher("LoginFail.jsp").forward(request, response);
			}
			else if (u.getPassword().equals(" ") || u.getEmail().equals(" ")) {
				request.getRequestDispatcher("LoginFail.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("LoginFail.jsp").forward(request, response);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}