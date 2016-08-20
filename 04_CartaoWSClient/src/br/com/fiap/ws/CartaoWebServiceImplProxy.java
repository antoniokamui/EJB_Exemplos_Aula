package br.com.fiap.ws;

public class CartaoWebServiceImplProxy implements br.com.fiap.ws.CartaoWebServiceImpl {
  private String _endpoint = null;
  private br.com.fiap.ws.CartaoWebServiceImpl cartaoWebServiceImpl = null;
  
  public CartaoWebServiceImplProxy() {
    _initCartaoWebServiceImplProxy();
  }
  
  public CartaoWebServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCartaoWebServiceImplProxy();
  }
  
  private void _initCartaoWebServiceImplProxy() {
    try {
      cartaoWebServiceImpl = (new br.com.fiap.ws.CartaoendpointLocator()).getCartaoWebServiceImplPort();
      if (cartaoWebServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cartaoWebServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cartaoWebServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cartaoWebServiceImpl != null)
      ((javax.xml.rpc.Stub)cartaoWebServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.ws.CartaoWebServiceImpl getCartaoWebServiceImpl() {
    if (cartaoWebServiceImpl == null)
      _initCartaoWebServiceImplProxy();
    return cartaoWebServiceImpl;
  }
  
  public java.lang.String validarCartao(java.lang.String numero, double valor) throws java.rmi.RemoteException{
    if (cartaoWebServiceImpl == null)
      _initCartaoWebServiceImplProxy();
    return cartaoWebServiceImpl.validarCartao(numero, valor);
  }
  
  
}