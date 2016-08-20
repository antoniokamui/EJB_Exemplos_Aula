package br.com.fiap.interfaces;

import br.com.fiap.entity.Funcionarios;

public interface CalculoIRPF {
	
	double calcularIrpf(double salario);
	
	double calcularInss(double salario);
	
	void inserirFuncionario(Funcionarios funcionario);

}
