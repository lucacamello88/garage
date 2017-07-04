package servletveicolo;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GestGar.VeicoloDao;
import GestGar.VeicoloDaoImpl;

@WebServlet("/remuveVeicolo")
public class RemuveVeicolo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(RemuveVeicolo.class.getName());

	VeicoloDao veicolo1 = new VeicoloDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			int id = Integer.parseInt(request.getParameter("id"));
			veicolo1.remuveVeicolo(veicolo1.getVeicoloById(id));
			response.sendRedirect("listContacts");
		} catch (Exception e) {
			logger.warning(e.getMessage());
		}
	}

}
