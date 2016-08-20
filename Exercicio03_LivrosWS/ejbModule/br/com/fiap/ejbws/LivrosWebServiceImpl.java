package br.com.fiap.ejbws;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Livros;

@Stateless
@WebService(serviceName = "LivrosWebService", portName = "LivrosWebServicePort", endpointInterface = "br.com.fiap.ejbws.LivrosWebService", targetNamespace = "http://jaxws.exemplos.fiap.com.br")
public class LivrosWebServiceImpl implements LivrosWebService {

	@PersistenceContext(unitName = "fiapPU")
	private EntityManager em;

	@Override
	public void add(Livros livro) {
		em.persist(livro);
	}

	@Override
	public List<Livros> getAll() {
		TypedQuery<Livros> query = em.createQuery("select u from Livros u", Livros.class);
		return query.getResultList();
	}
	


}