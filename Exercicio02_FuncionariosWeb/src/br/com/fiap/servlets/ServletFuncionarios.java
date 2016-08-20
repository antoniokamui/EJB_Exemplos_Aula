package br.com.fiap.servlets;

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

import br.com.fiap.bean.FuncionariosBeanRemote;
import br.com.fiap.entity.Funcionarios;

/**
 * Servlet implementation class ServletLivros
 */
@WebServlet("/ServletFuncionarios")
public class ServletFuncionarios extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletFuncionarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			InitialContext ctx = new InitialContext();
			FuncionariosBeanRemote service = (FuncionariosBeanRemote) ctx.lookup("ejb:/Exercicio02_FuncionariosWeb/FuncionariosBean!br.com.fiap.bean.FuncionariosBeanRemote");
			List<Funcionarios> lista = service.getAll();
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
			FuncionariosBeanRemote service = (FuncionariosBeanRemote) ctx.lookup("ejb:/Exercicio02_FuncionariosWeb/FuncionariosBean!br.com.fiap.bean.FuncionariosBeanRemote");
			Funcionarios func = new Funcionarios();
			
			func.setCpf(Integer.parseInt(request.getParameter("cpf")));
			func.setNome(request.getParameter("nome"));
			func.setSalario(Double.parseDouble(request.getParameter("salario")));
			func.setCargo(request.getParameter("cargo"));
			
			func.setInss(service.calcularINSS(func.getSalario()));
			func.setIrpf(service.calcularIRPF(func.getSalario()));
			
			service.add(func);
			
			List<Funcionarios> lista = service.getAll();
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (NamingException e) {
			out.print(e.getMessage());
			// e.printStackTrace();
		}
	}

}
