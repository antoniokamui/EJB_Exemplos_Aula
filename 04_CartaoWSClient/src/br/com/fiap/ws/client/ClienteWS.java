package br.com.fiap.ws.client;

import br.com.fiap.ws.CartaoWebServiceImpl;
import br.com.fiap.ws.CartaoWebServiceImplProxy;

public class ClienteWS {
	public static void main(String[] args) {
		CartaoWebServiceImpl ws = new CartaoWebServiceImplProxy();
		try {
			String cartao = "1234123412341234";
			double valor = 120;

			System.out.println(ws.validarCartao(cartao, valor));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
