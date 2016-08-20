package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.LivrosBeanRemote;
import br.com.fiap.entity.Livros;

/**
 * Servlet implementation class ServletLivros
 */
@WebServlet("/livros")
public class ServletLivros extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLivros() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			InitialContext ctx = new InitialContext();
			LivrosBeanRemote service = (LivrosBeanRemote) ctx.lookup("ejb:/03_LivrosWeb/LivrosBean!br.com.fiap.bean.LivrosBeanRemote");
			List<Livros> lista = service.getAll();
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("index.jsp").forward(request, response);

		} catch (NamingException e) {
			out.print(e.getMessage());
			// e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			InitialContext ctx = new InitialContext();
			LivrosBeanRemote service = (LivrosBeanRemote) ctx.lookup("ejb:/03_LivrosWeb/LivrosBean!br.com.fiap.bean.LivrosBeanRemote");
			Livros livros = new Livros();
			
			livros.setTitulo(request.getParameter("titulo"));
			livros.setAutor(request.getParameter("autor"));
			livros.setPreco(Double.parseDouble(request.getParameter("valor")));
			
			service.add(livros);
			
			List<Livros> lista = service.getAll();
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (NamingException e) {
			out.print(e.getMessage());
			// e.printStackTrace();
		}
	}

}
