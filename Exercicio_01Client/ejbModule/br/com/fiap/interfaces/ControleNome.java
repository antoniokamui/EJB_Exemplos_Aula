package br.com.fiap.interfaces;

import java.util.List;

import javax.ejb.Stateful;

@Stateful
public interface ControleNome {
	List<String> buscarNomes();
	void incluirNome(String nome); 
}
