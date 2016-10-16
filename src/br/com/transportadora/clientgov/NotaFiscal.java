
package br.com.transportadora.clientgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaFiscal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaFiscal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaFiscal", propOrder = {
    "cnpjEmissor",
    "cnpjReceptor",
    "cpfEmissor",
    "cpfReceptor",
    "valorTotal"
})
public class NotaFiscal {

    protected String cnpjEmissor;
    protected String cnpjReceptor;
    protected String cpfEmissor;
    protected String cpfReceptor;
    protected Double valorTotal;

    /**
     * Gets the value of the cnpjEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEmissor() {
        return cnpjEmissor;
    }

    /**
     * Sets the value of the cnpjEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEmissor(String value) {
        this.cnpjEmissor = value;
    }

    /**
     * Gets the value of the cnpjReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjReceptor() {
        return cnpjReceptor;
    }

    /**
     * Sets the value of the cnpjReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjReceptor(String value) {
        this.cnpjReceptor = value;
    }

    /**
     * Gets the value of the cpfEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfEmissor() {
        return cpfEmissor;
    }

    /**
     * Sets the value of the cpfEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfEmissor(String value) {
        this.cpfEmissor = value;
    }

    /**
     * Gets the value of the cpfReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfReceptor() {
        return cpfReceptor;
    }

    /**
     * Sets the value of the cpfReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfReceptor(String value) {
        this.cpfReceptor = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotal(Double value) {
        this.valorTotal = value;
    }

}
