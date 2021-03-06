
package br.com.transportadora.clientgov;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceNF", targetNamespace = "http://ws.governo.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceNF {


    /**
     * 
     * @param valorTotalProdutos
     * @param cpfOuCnpjDestinatario
     * @return
     *     returns br.com.transportadora.clientgov.NotaFiscal
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "emitirNotaFiscal", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.EmitirNotaFiscal")
    @ResponseWrapper(localName = "emitirNotaFiscalResponse", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.EmitirNotaFiscalResponse")
    public NotaFiscal emitirNotaFiscal(
        @WebParam(name = "cpfOuCnpjDestinatario", targetNamespace = "")
        String cpfOuCnpjDestinatario,
        @WebParam(name = "valorTotalProdutos", targetNamespace = "")
        Double valorTotalProdutos)
        throws Exception_Exception
    ;

    /**
     * 
     * @param cpfOuCnpj
     * @return
     *     returns java.util.List<br.com.transportadora.clientgov.NotaFiscal>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarNotasFiscais", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.ListarNotasFiscais")
    @ResponseWrapper(localName = "listarNotasFiscaisResponse", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.ListarNotasFiscaisResponse")
    public List<NotaFiscal> listarNotasFiscais(
        @WebParam(name = "cpfOuCnpj", targetNamespace = "")
        String cpfOuCnpj)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<br.com.transportadora.clientgov.Imposto>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarImpostos", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.ListarImpostos")
    @ResponseWrapper(localName = "listarImpostosResponse", targetNamespace = "http://ws.governo.com.br/", className = "br.com.transportadora.clientgov.ListarImpostosResponse")
    public List<Imposto> listarImpostos()
        throws Exception_Exception
    ;

}
