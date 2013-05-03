package com.redsparksystems.aspects;

/**
 * User: Christopher M. Jansen
 * Date: 4/19/13
 * Time: 10:56 AM
 * Red Spark Systems
 */
public aspect SerializationAspect {
	declare parents : com.redsparksystems.domain..* implements java.io.Serializable;
    static long serialVersionUID = 17L;
}
