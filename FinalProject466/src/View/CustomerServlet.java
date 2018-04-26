package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Customer;
import Model.UserDao;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
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
		
		Customer c = new Customer();
		String email, isadmin;
		String balance;
		double balance1;
		
		try {
			email = request.getParameter("email");
			isadmin = request.getParameter("isadmin");
			balance = request.getParameter("balance");
			balance1 = new Double(balance).doubleValue();
			c.setEmail(email);
			c.setIsadmin(isadmin);
			c.setBalance(balance1);
			request.getSession().setAttribute("regUser", c);
			request.getRequestDispatcher("Validate.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}