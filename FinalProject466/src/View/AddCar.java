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
 * Servlet implementation class AddCar
 */
@WebServlet("/AddCar")
public class AddCar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
	public AddCar() {
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
		String id, name, type;
		int rentprice, buyprice;
		
		try {
			id = request.getParameter("carid");
			name = request.getParameter("carname");
			type = request.getParameter("cartype");
			rentprice = Integer.parseInt(request.getParameter("rentprice"));
			buyprice = Integer.parseInt(request.getParameter("buyprice"));
			c.setBuyPrice(buyprice);
			c.setId(id);
			c.setName(name);
			c.setRentPrice(rentprice);
			c.setType(type);
			//CarDao.addCar(c);
			request.getSession().setAttribute("car", c);
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}