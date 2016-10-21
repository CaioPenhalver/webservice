package br.com.governo.ws;

import br.com.transportadora.clientgov.Imposto;

public class WebServiceNFProxy implements br.com.governo.ws.WebServiceNF {
  private String _endpoint = null;
  private br.com.governo.ws.WebServiceNF webServiceNF = null;
  
  public WebServiceNFProxy() {
    _initWebServiceNFProxy();
  }
  
  public WebServiceNFProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceNFProxy();
  }
  
  private void _initWebServiceNFProxy() {
    try {
      webServiceNF = (new br.com.governo.ws.WebServiceNFServiceLocator()).getWebServiceNFPort();
      if (webServiceNF != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceNF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceNF)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceNF != null)
      ((javax.xml.rpc.Stub)webServiceNF)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.governo.ws.WebServiceNF getWebServiceNF() {
    if (webServiceNF == null)
      _initWebServiceNFProxy();
    return webServiceNF;
  }
  
  public br.com.governo.ws.NotaFiscal emitirNotaFiscal(java.lang.String cpfOuCnpjDestinatario, java.lang.Double valorTotalProdutos) throws java.rmi.RemoteException, br.com.governo.ws.Exception{
    if (webServiceNF == null)
      _initWebServiceNFProxy();
    return webServiceNF.emitirNotaFiscal(cpfOuCnpjDestinatario, valorTotalProdutos);
  }
  
  public br.com.governo.ws.NotaFiscal[] listarNotasFiscais(java.lang.String cpfOuCnpj) throws java.rmi.RemoteException, br.com.governo.ws.Exception{
    if (webServiceNF == null)
      _initWebServiceNFProxy();
    return webServiceNF.listarNotasFiscais(cpfOuCnpj);
  }
  
  public void cadastrarUsuario(java.lang.String cpfOuCnpj, java.lang.String password) throws java.rmi.RemoteException{
    if (webServiceNF == null)
      _initWebServiceNFProxy();
    webServiceNF.cadastrarUsuario(cpfOuCnpj, password);
  }
  
  public Imposto[] listarImpostos() throws java.rmi.RemoteException, br.com.governo.ws.Exception{
    if (webServiceNF == null)
      _initWebServiceNFProxy();
    return webServiceNF.listarImpostos();
  }
  
  
}