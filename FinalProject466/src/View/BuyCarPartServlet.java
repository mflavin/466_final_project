package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CarPart;
import Model.CarPartDao;
import Model.UserDao;

/**
 * Servlet implementation class BuyCarPartServlet
 */
@WebServlet("/BuyCarPartServlet")
public class BuyCarPartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyCarPartServlet() {
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
		
		CarPart cp = new CarPart();
		String id, name, type;
		double buyprice;
		
		try {
			//add buy car part logic
			//CarPartDao.buyCarPart(cp);
			request.getSession().setAttribute("CarPart", cp);
			request.getRequestDispatcher("BuyPart.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}