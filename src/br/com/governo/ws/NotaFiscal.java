/**
 * NotaFiscal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.governo.ws;

public class NotaFiscal  implements java.io.Serializable {
    private java.lang.String cnpjEmissor;

    private java.lang.String cnpjReceptor;

    private java.lang.String cpfEmissor;

    private java.lang.String cpfReceptor;

    private java.lang.Double valorTotal;

    public NotaFiscal() {
    }

    public NotaFiscal(
           java.lang.String cnpjEmissor,
           java.lang.String cnpjReceptor,
           java.lang.String cpfEmissor,
           java.lang.String cpfReceptor,
           java.lang.Double valorTotal) {
           this.cnpjEmissor = cnpjEmissor;
           this.cnpjReceptor = cnpjReceptor;
           this.cpfEmissor = cpfEmissor;
           this.cpfReceptor = cpfReceptor;
           this.valorTotal = valorTotal;
    }


    /**
     * Gets the cnpjEmissor value for this NotaFiscal.
     * 
     * @return cnpjEmissor
     */
    public java.lang.String getCnpjEmissor() {
        return cnpjEmissor;
    }


    /**
     * Sets the cnpjEmissor value for this NotaFiscal.
     * 
     * @param cnpjEmissor
     */
    public void setCnpjEmissor(java.lang.String cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
    }


    /**
     * Gets the cnpjReceptor value for this NotaFiscal.
     * 
     * @return cnpjReceptor
     */
    public java.lang.String getCnpjReceptor() {
        return cnpjReceptor;
    }


    /**
     * Sets the cnpjReceptor value for this NotaFiscal.
     * 
     * @param cnpjReceptor
     */
    public void setCnpjReceptor(java.lang.String cnpjReceptor) {
        this.cnpjReceptor = cnpjReceptor;
    }


    /**
     * Gets the cpfEmissor value for this NotaFiscal.
     * 
     * @return cpfEmissor
     */
    public java.lang.String getCpfEmissor() {
        return cpfEmissor;
    }


    /**
     * Sets the cpfEmissor value for this NotaFiscal.
     * 
     * @param cpfEmissor
     */
    public void setCpfEmissor(java.lang.String cpfEmissor) {
        this.cpfEmissor = cpfEmissor;
    }


    /**
     * Gets the cpfReceptor value for this NotaFiscal.
     * 
     * @return cpfReceptor
     */
    public java.lang.String getCpfReceptor() {
        return cpfReceptor;
    }


    /**
     * Sets the cpfReceptor value for this NotaFiscal.
     * 
     * @param cpfReceptor
     */
    public void setCpfReceptor(java.lang.String cpfReceptor) {
        this.cpfReceptor = cpfReceptor;
    }


    /**
     * Gets the valorTotal value for this NotaFiscal.
     * 
     * @return valorTotal
     */
    public java.lang.Double getValorTotal() {
        return valorTotal;
    }


    /**
     * Sets the valorTotal value for this NotaFiscal.
     * 
     * @param valorTotal
     */
    public void setValorTotal(java.lang.Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotaFiscal)) return false;
        NotaFiscal other = (NotaFiscal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cnpjEmissor==null && other.getCnpjEmissor()==null) || 
             (this.cnpjEmissor!=null &&
              this.cnpjEmissor.equals(other.getCnpjEmissor()))) &&
            ((this.cnpjReceptor==null && other.getCnpjReceptor()==null) || 
             (this.cnpjReceptor!=null &&
              this.cnpjReceptor.equals(other.getCnpjReceptor()))) &&
            ((this.cpfEmissor==null && other.getCpfEmissor()==null) || 
             (this.cpfEmissor!=null &&
              this.cpfEmissor.equals(other.getCpfEmissor()))) &&
            ((this.cpfReceptor==null && other.getCpfReceptor()==null) || 
             (this.cpfReceptor!=null &&
              this.cpfReceptor.equals(other.getCpfReceptor()))) &&
            ((this.valorTotal==null && other.getValorTotal()==null) || 
             (this.valorTotal!=null &&
              this.valorTotal.equals(other.getValorTotal())));
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
        if (getCnpjEmissor() != null) {
            _hashCode += getCnpjEmissor().hashCode();
        }
        if (getCnpjReceptor() != null) {
            _hashCode += getCnpjReceptor().hashCode();
        }
        if (getCpfEmissor() != null) {
            _hashCode += getCpfEmissor().hashCode();
        }
        if (getCpfReceptor() != null) {
            _hashCode += getCpfReceptor().hashCode();
        }
        if (getValorTotal() != null) {
            _hashCode += getValorTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotaFiscal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.governo.com.br/", "notaFiscal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpjEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpjReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfEmissor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfEmissor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
