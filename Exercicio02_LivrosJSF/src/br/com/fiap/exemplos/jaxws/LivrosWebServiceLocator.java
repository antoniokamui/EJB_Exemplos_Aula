/**
 * LivrosWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.exemplos.jaxws;

public class LivrosWebServiceLocator extends org.apache.axis.client.Service implements br.com.fiap.exemplos.jaxws.LivrosWebService {

    public LivrosWebServiceLocator() {
    }


    public LivrosWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivrosWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivrosWebServicePort
    private java.lang.String LivrosWebServicePort_address = "http://localhost:8080/Exercicio03_LivrosWS/LivrosWebService/LivrosWebServiceImpl";

    public java.lang.String getLivrosWebServicePortAddress() {
        return LivrosWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivrosWebServicePortWSDDServiceName = "LivrosWebServicePort";

    public java.lang.String getLivrosWebServicePortWSDDServiceName() {
        return LivrosWebServicePortWSDDServiceName;
    }

    public void setLivrosWebServicePortWSDDServiceName(java.lang.String name) {
        LivrosWebServicePortWSDDServiceName = name;
    }

    public br.com.fiap.exemplos.jaxws.LivrosWebServicePortType getLivrosWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivrosWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivrosWebServicePort(endpoint);
    }

    public br.com.fiap.exemplos.jaxws.LivrosWebServicePortType getLivrosWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.exemplos.jaxws.LivrosWebServiceSoapBindingStub _stub = new br.com.fiap.exemplos.jaxws.LivrosWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivrosWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivrosWebServicePortEndpointAddress(java.lang.String address) {
        LivrosWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.exemplos.jaxws.LivrosWebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.exemplos.jaxws.LivrosWebServiceSoapBindingStub _stub = new br.com.fiap.exemplos.jaxws.LivrosWebServiceSoapBindingStub(new java.net.URL(LivrosWebServicePort_address), this);
                _stub.setPortName(getLivrosWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LivrosWebServicePort".equals(inputPortName)) {
            return getLivrosWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxws.exemplos.fiap.com.br", "LivrosWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxws.exemplos.fiap.com.br", "LivrosWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivrosWebServicePort".equals(portName)) {
            setLivrosWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
