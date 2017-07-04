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
import Model.Veicolo;

@WebServlet("/updateVeicolo")
public class UpdateVeicolo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(UpdateVeicolo.class.getName());

	private int id;

	VeicoloDao veicolo = new VeicoloDaoImpl();

	Veicolo veicoloById = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			id = Integer.parseInt(request.getParameter("id"));
			veicoloById = veicolo.getVeicoloById(id);
			request.setAttribute("veicolo", veicoloById);
			request.getRequestDispatcher("updateVeicolo.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			logger.warning(e.getMessage());
		} catch (Exception e) {
			logger.warning(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			veicoloById.setTarga(request.getParameter("targa"));
			veicoloById.setMarca(request.getParameter("marca"));
			veicoloById.setModello(request.getParameter("modello"));
			veicoloById.setCostoOrario(Double.parseDouble(request.getParameter("costoOrario")));
			// veicoloById.setUser((User)
			// request.getSession().getAttribute("user"));
			veicolo.updateVeicolo(veicoloById);
			response.sendRedirect("listVeicoli");
		} catch (Exception e) {
			logger.warning(e.getMessage());
			response.sendRedirect("updateVeicolo?id=" + id + "&error=true");
		}
	}

}
