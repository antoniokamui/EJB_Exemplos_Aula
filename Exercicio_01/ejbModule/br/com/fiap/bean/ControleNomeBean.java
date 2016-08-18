package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;

import br.com.fiap.interfaces.ControleNome;

@Stateful
@Local(ControleNome.class)
public class ControleNomeBean implements ControleNome{
	private List<String> nomes = new ArrayList<>();



	@Override
	public List<String> buscarNomes() {
		// TODO Auto-generated method stub
		return nomes;
	}

	@Override
	public void incluirNome(String nome) {
		nomes.add(nome);
		
	}

}
