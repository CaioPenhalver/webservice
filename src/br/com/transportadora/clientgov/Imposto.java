
package br.com.transportadora.clientgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imposto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imposto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliquota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imposto", propOrder = {
    "aliquota",
    "sigla"
})
public class Imposto {

    protected Double aliquota;
    protected String sigla;

    /**
     * Gets the value of the aliquota property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAliquota() {
        return aliquota;
    }

    /**
     * Sets the value of the aliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAliquota(Double value) {
        this.aliquota = value;
    }

    /**
     * Gets the value of the sigla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Sets the value of the sigla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigla(String value) {
        this.sigla = value;
    }

}
