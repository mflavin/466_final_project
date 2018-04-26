package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Car;
import Model.CarDao;
import Model.UserDao;

/**
 * Servlet implementation class BuyCarServlet
 */
@WebServlet("/BuyCarServlet")
public class BuyCarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyCarServlet() {
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
		double rentprice, buyprice;
		
		try {
			//add buy car logic
			//CarDao.buyCar(c);
			request.getSession().setAttribute("Car", c);
			request.getRequestDispatcher("BuyCar.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}