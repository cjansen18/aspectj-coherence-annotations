//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.entity.message._2007;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultSeverity_Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultSeverity_Enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFORMATION"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="CRITICAL_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultSeverity_Enum", namespace = "http://service.redsparksystems.com/entity/message/2007/")
@XmlEnum
public enum FaultSeverityEnum {


    /**
     * The service processed the message completely.   The results may not be what the client expects.
     * 
     * 
     */
    INFORMATION,

    /**
     * The service encountered an expected error situation. The service recovered and the message was processed completely, but the fact that it happened should be recorded to monitor frequency.
     * 
     */
    WARNING,

    /**
     * The services encountered an unexpected error, which means the code intercepted an error it cannot handle. All or part of the request was not processed completely. This error is not of a critical nature and typically can be recovered from automatically. Future requests into the system should be able to be processed without error. Someone should be contacted in the near future to resolve the error and to see if changes can be made to prevent the error from happening again.
     * 
     */
    ERROR,

    /**
     * The service encountered a critical error, which affects the accuracy, integrity, reliability, or capability of the system. The request was not processed. Someone should be contacted to address the error as soon as possible.
     * 
     */
    CRITICAL_ERROR;

    public String value() {
        return name();
    }

    public static FaultSeverityEnum fromValue(String v) {
        return valueOf(v);
    }

}