package com.redsparksystems.aspects;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Christopher M. Jansen
 * Date: 4/19/13
 * Time: 10:56 AM
 * Red Spark Systems
 */
public aspect XmlRootElementAspect {
    //class level annotations
    declare @type: com.redsparksystems.domain..* : @XmlRootElement;
}
