/**
 * WebServiceNF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.governo.ws;

import br.com.transportadora.clientgov.Imposto;

public interface WebServiceNF extends java.rmi.Remote {
    public br.com.governo.ws.NotaFiscal emitirNotaFiscal(java.lang.String cpfOuCnpjDestinatario, java.lang.Double valorTotalProdutos) throws java.rmi.RemoteException, br.com.governo.ws.Exception;
    public br.com.governo.ws.NotaFiscal[] listarNotasFiscais(java.lang.String cpfOuCnpj) throws java.rmi.RemoteException, br.com.governo.ws.Exception;
    public void cadastrarUsuario(java.lang.String cpfOuCnpj, java.lang.String password) throws java.rmi.RemoteException;
    public Imposto[] listarImpostos() throws java.rmi.RemoteException, br.com.governo.ws.Exception;
}
