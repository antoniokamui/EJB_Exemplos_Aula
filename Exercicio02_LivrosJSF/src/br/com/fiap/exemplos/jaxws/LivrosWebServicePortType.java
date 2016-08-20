/**
 * LivrosWebServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.exemplos.jaxws;

public interface LivrosWebServicePortType extends java.rmi.Remote {
    public br.com.fiap.exemplos.jaxws.Livros[] getAll() throws java.rmi.RemoteException;
    public void add(br.com.fiap.exemplos.jaxws.Livros arg0) throws java.rmi.RemoteException;
}
