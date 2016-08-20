package br.com.fiap.mb;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import br.com.fiap.exemplos.jaxws.Livros;
import br.com.fiap.exemplos.jaxws.LivrosWebServicePortTypeProxy;

public class LivrosMB {
	List<Livros> lista;
	
	public LivrosMB() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init(){
		LivrosWebServicePortTypeProxy service =  new LivrosWebServicePortTypeProxy();
		try {
			lista = Arrays.asList(service.getAll());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}
