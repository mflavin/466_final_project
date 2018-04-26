package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Admin;
import Model.UserDao;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		
		Admin a = new Admin();
		String email, isadmin;
		String balance;
		double balance1;

		try {
			email = request.getParameter("email");
			isadmin = request.getParameter("isadmin");
			balance = request.getParameter("balance");
			balance1 = new Double(balance).doubleValue();
			a.setEmail(email);
			a.setIsadmin(isadmin);
			a.setBalance(balance1);
			request.getSession().setAttribute("regUser", a);
			request.getRequestDispatcher("Validate.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}