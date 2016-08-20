package br.com.fiap.exemplos.jaxws;

public class LivrosWebServicePortTypeProxy implements br.com.fiap.exemplos.jaxws.LivrosWebServicePortType {
  private String _endpoint = null;
  private br.com.fiap.exemplos.jaxws.LivrosWebServicePortType livrosWebServicePortType = null;
  
  public LivrosWebServicePortTypeProxy() {
    _initLivrosWebServicePortTypeProxy();
  }
  
  public LivrosWebServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivrosWebServicePortTypeProxy();
  }
  
  private void _initLivrosWebServicePortTypeProxy() {
    try {
      livrosWebServicePortType = (new br.com.fiap.exemplos.jaxws.LivrosWebServiceLocator()).getLivrosWebServicePort();
      if (livrosWebServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livrosWebServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livrosWebServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livrosWebServicePortType != null)
      ((javax.xml.rpc.Stub)livrosWebServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.exemplos.jaxws.LivrosWebServicePortType getLivrosWebServicePortType() {
    if (livrosWebServicePortType == null)
      _initLivrosWebServicePortTypeProxy();
    return livrosWebServicePortType;
  }
  
  public br.com.fiap.exemplos.jaxws.Livros[] getAll() throws java.rmi.RemoteException{
    if (livrosWebServicePortType == null)
      _initLivrosWebServicePortTypeProxy();
    return livrosWebServicePortType.getAll();
  }
  
  public void add(br.com.fiap.exemplos.jaxws.Livros arg0) throws java.rmi.RemoteException{
    if (livrosWebServicePortType == null)
      _initLivrosWebServicePortTypeProxy();
    livrosWebServicePortType.add(arg0);
  }
  
  
}