//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.base._2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product_Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Product_Enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FXDRAWDWN"/>
 *     &lt;enumeration value="FXFWD"/>
 *     &lt;enumeration value="FXNDF"/>
 *     &lt;enumeration value="FXNDFPOSTR"/>
 *     &lt;enumeration value="FXPOSTRAN"/>
 *     &lt;enumeration value="FXSPOT"/>
 *     &lt;enumeration value="FXSWAP"/>
 *     &lt;enumeration value="FXWINDOFWD"/>
 *     &lt;enumeration value="MCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Product_Enum", namespace = "http://service.redsparksystems.com/provider/fxaip/base/2013/")
@XmlEnum
public enum ProductEnum {

    FXDRAWDWN,
    FXFWD,
    FXNDF,
    FXNDFPOSTR,
    FXPOSTRAN,
    FXSPOT,
    FXSWAP,
    FXWINDOFWD,
    MCA;

    public String value() {
        return name();
    }

    public static ProductEnum fromValue(String v) {
        return valueOf(v);
    }

}
