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
 * Servlet implementation class DeleteCarPart
 */
@WebServlet("/DeleteCarPart")
public class DeleteCarPart extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCarPart() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		CarPart cp = new CarPart();
		String id, name, type;
		int buyprice;
		
		try {
			request.getRequestDispatcher("Admin.jsp").forward(request, response);
			id = request.getParameter("id");
			name = request.getParameter("name");
			type = request.getParameter("type");
			buyprice = Integer.parseInt(request.getParameter("buyprice"));
			cp.setBuyPrice(buyprice);
			cp.setId(id);
			cp.setName(name);
			cp.setType(type);
			CarPartDao.deleteCarPart(cp);
			request.getSession().setAttribute("CarPart", cp);
		} catch(Exception e) {
			e.printStackTrace();
	    }
	}
}