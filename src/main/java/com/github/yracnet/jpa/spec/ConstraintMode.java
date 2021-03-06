//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.19 at 03:14:26 AM BOT 
//


package com.github.yracnet.jpa.spec;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constraint-mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constraint-mode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CONSTRAINT"/>
 *     &lt;enumeration value="NO_CONSTRAINT"/>
 *     &lt;enumeration value="PROVIDER_DEFAULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constraint-mode")
@XmlEnum
public enum ConstraintMode {

    CONSTRAINT,
    NO_CONSTRAINT,
    PROVIDER_DEFAULT;

    public String value() {
        return name();
    }

    public static ConstraintMode fromValue(String v) {
        return valueOf(v);
    }

}
