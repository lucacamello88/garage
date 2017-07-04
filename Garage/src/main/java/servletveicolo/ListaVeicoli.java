package servletveicolo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GestGar.VeicoloDao;
import GestGar.VeicoloDaoImpl;
import Model.User;
import Model.Veicolo;

@WebServlet("/listVeicoli")
public class ListaVeicoli extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ListaVeicoli.class.getName());

	VeicoloDao veicolo1 = new VeicoloDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ArrayList<Veicolo> listVeicoliByUser = veicolo1
					.getListVeicoloByUser((User) request.getSession().getAttribute("user"));
			request.setAttribute("list", listVeicoliByUser);
			request.getRequestDispatcher("listVeicoli.jsp").forward(request, response);
		} catch (Exception e) {
			logger.warning(e.getMessage());
		}
	}
}