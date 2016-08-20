/**
 * LivrosWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.exemplos.jaxws;

public interface LivrosWebService extends javax.xml.rpc.Service {
    public java.lang.String getLivrosWebServicePortAddress();

    public br.com.fiap.exemplos.jaxws.LivrosWebServicePortType getLivrosWebServicePort() throws javax.xml.rpc.ServiceException;

    public br.com.fiap.exemplos.jaxws.LivrosWebServicePortType getLivrosWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
