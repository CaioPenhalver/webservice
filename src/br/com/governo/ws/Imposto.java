/**
 * Imposto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.governo.ws;

public class Imposto  implements java.io.Serializable {
    private java.lang.Double aliquota;

    private java.lang.String sigla;

    public Imposto() {
    }

    public Imposto(
           java.lang.Double aliquota,
           java.lang.String sigla) {
           this.aliquota = aliquota;
           this.sigla = sigla;
    }


    /**
     * Gets the aliquota value for this Imposto.
     * 
     * @return aliquota
     */
    public java.lang.Double getAliquota() {
        return aliquota;
    }


    /**
     * Sets the aliquota value for this Imposto.
     * 
     * @param aliquota
     */
    public void setAliquota(java.lang.Double aliquota) {
        this.aliquota = aliquota;
    }


    /**
     * Gets the sigla value for this Imposto.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this Imposto.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Imposto)) return false;
        Imposto other = (Imposto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aliquota==null && other.getAliquota()==null) || 
             (this.aliquota!=null &&
              this.aliquota.equals(other.getAliquota()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAliquota() != null) {
            _hashCode += getAliquota().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Imposto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.governo.com.br/", "imposto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aliquota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
