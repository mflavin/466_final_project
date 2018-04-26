package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;
import Model.UserDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		
		User u = new User();
		String userid, password, fname, lname, email, streetaddress, city, state, zip, sex;
		
		try {
			userid = request.getParameter("userid");
			password = request.getParameter("password");
			fname = request.getParameter("fname");
			lname = request.getParameter("lname");
			email = request.getParameter("email");
			streetaddress = request.getParameter("streetaddress");
			city = request.getParameter("city");
			state = request.getParameter("state");
			zip = request.getParameter("zip");
			sex = request.getParameter("sex");
			u.setId(userid);
			u.setPassword(password);
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setStreetaddress(streetaddress);
			u.setCity(city);
			u.setState(state);
			u.setZip(zip);
			u.setSex(sex);
			request.getSession().setAttribute("regUser", u);
			request.getRequestDispatcher("Validate.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}