package br.com.fiap.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.fiap.entity.Funcionarios;

/**
 * Session Bean implementation class CalculaIRPF
 */
@Stateless
public class CalculaIRPF implements CalculaIRPFLocal {

	@PersistenceContext(unitName = "fiapFuncPU")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public CalculaIRPF() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double calcularIrpf(double salario) {
		double[] taxas = { 0, 7.5, 15, 22.5, 27.5 };
		double[] valores = { 0, 1499.15, 2246.75, 2995.7, 3743.19 };

		double imposto = 0;

		for (int i = taxas.length - 1; i >= 0; i--) {
			if (salario > valores[i]) {
				imposto += (salario - valores[i]) * taxas[i] / 100;
				salario = valores[i];
			}
		}
		return imposto;
	}

	@Override
	public double calcularInss(double salario) {
		return salario*0.1;
	}

	@Override
	public void inserirFuncionario(Funcionarios funcionario) {
		em.persist(funcionario);
	}

}
