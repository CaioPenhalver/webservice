
package br.com.transportadora.clientgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emitirNotaFiscal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emitirNotaFiscal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfOuCnpjDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalProdutos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emitirNotaFiscal", propOrder = {
    "cpfOuCnpjDestinatario",
    "valorTotalProdutos"
})
public class EmitirNotaFiscal {

    protected String cpfOuCnpjDestinatario;
    protected Double valorTotalProdutos;

    /**
     * Gets the value of the cpfOuCnpjDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfOuCnpjDestinatario() {
        return cpfOuCnpjDestinatario;
    }

    /**
     * Sets the value of the cpfOuCnpjDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfOuCnpjDestinatario(String value) {
        this.cpfOuCnpjDestinatario = value;
    }

    /**
     * Gets the value of the valorTotalProdutos property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    /**
     * Sets the value of the valorTotalProdutos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotalProdutos(Double value) {
        this.valorTotalProdutos = value;
    }

}
