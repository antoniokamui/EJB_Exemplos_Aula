package br.com.fiap.bean;

import java.util.List;
import javax.ejb.Remote;
import br.com.fiap.entity.Funcionarios;

@Remote
public interface FuncionariosBeanRemote {
	void add(Funcionarios func);
	List<Funcionarios> getAll();
	
	double calcularINSS(double salario);
	double calcularIRPF(double salario);
}