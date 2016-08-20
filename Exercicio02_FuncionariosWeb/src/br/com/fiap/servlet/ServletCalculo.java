package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.CalculaIRPFLocal;
import br.com.fiap.entity.Funcionarios;

@WebServlet("/calculo")
public class ServletCalculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	CalculaIRPFLocal cal;
       
    public ServletCalculo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try{
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String cargo = request.getParameter("cargo");
			
			double salario = Double.parseDouble(request.getParameter("salario"));			
			double valorCalculoINSS = cal.calcularInss(salario);
			double valorCalculoIRPF = cal.calcularIrpf(salario-valorCalculoINSS);
			
			Funcionarios funcionario = new Funcionarios();
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setCargo(cargo);
			funcionario.setInss(valorCalculoINSS);
			funcionario.setIrpf(valorCalculoIRPF);
			funcionario.setSalario(salario);
			
			cal.inserirFuncionario(funcionario);
			
			request.setAttribute("resultado",nome + ", para o salario " + salario + ", temos um valor de INSS de " + valorCalculoINSS + " e de IRPF de " + valorCalculoIRPF);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("resultado","Houve um erro: " + e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
