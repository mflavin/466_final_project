package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Car;
import Model.CarDao;
import Model.User;

/**
 * Servlet implementation class DeleteCar
 */
@WebServlet("/DeleteCar")
public class DeleteCar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
	public DeleteCar() {
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

		Car c = new Car();
		String id, check;

		try {
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
			id = request.getParameter("carid");
			check = request.getParameter("deletecar");
			if(id.equals(check)) {
				c.setBuyPrice(0);
				c.setId("");
				c.setName("");
				c.setRentPrice(0);
				c.setType("");
				//CarDao.deleteCar(c);
				request.getSession().setAttribute("car", c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}