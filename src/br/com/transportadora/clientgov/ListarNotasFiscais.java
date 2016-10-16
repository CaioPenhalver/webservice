
package br.com.transportadora.clientgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listarNotasFiscais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarNotasFiscais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfOuCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarNotasFiscais", propOrder = {
    "cpfOuCnpj"
})
public class ListarNotasFiscais {

    protected String cpfOuCnpj;

    /**
     * Gets the value of the cpfOuCnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    /**
     * Sets the value of the cpfOuCnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfOuCnpj(String value) {
        this.cpfOuCnpj = value;
    }

}
