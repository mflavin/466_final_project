package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CarPart;
import Model.CarPartDao;
import Model.User;

/**
 * Servlet implementation class AddCarPart
 */
@WebServlet("/AddCarPart")
public class AddCarPart extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarPart() {
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
		int buyprice;
		
		try {
			id = request.getParameter("partid");
			name = request.getParameter("partname");
			type = request.getParameter("parttype");
			buyprice = Integer.parseInt(request.getParameter("partbuyprice"));
			cp.setBuyPrice(buyprice);
			cp.setId(id);
			cp.setName(name);
			cp.setType(type);
			//CarPartDao.addCarPart(cp);
			request.getSession().setAttribute("part", cp);
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
	    }
	}
}