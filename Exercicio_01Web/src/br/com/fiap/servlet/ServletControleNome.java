package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.interfaces.ControleNome;

/**
 * Servlet implementation class ServletControleNome
 */
@WebServlet("/ServletControleNome")
public class ServletControleNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	ControleNome controleNome;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControleNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		
		
		try {
			
		for (String a :controleNome.buscarNomes()){
			out.println(a );
			out.println("<br/>" );
		}
			
			
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	
    	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		
		
		try {
			String nome = request.getParameter("nome");
			controleNome.incluirNome(nome);
			out.println("Incluido: " + nome);
			
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}

}
