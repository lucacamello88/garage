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

@WebServlet("/addContact")
public class AddVeicolo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(AddVeicolo.class.getName());

	VeicoloDao veicolo1 = new VeicoloDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("addVeicolo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Veicolo veicolo = new Veicolo();
			veicolo.setTarga(request.getParameter("targa"));
			veicolo.setMarca(request.getParameter("marca"));
			veicolo.setModello(request.getParameter("modello"));
			veicolo.setCostoOrario(Double.parseDouble(request.getParameter("costoOrario")));
			// veicolo.setUser((User)
			// request.getSession().getAttribute("user"));
			veicolo1.saveVeicolo(veicolo);
			response.sendRedirect("listVeicoli");
		} catch (Exception e) {
			logger.warning(e.getMessage());
			e.printStackTrace();
			response.sendRedirect("addVeicolo?error=true");
		}
	}

}
