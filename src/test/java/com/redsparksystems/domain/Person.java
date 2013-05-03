package com.redsparksystems.domain;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;

/**
 * User: Christopher M. Jansen
 * Date: 4/19/13
 * Time: 12:44 PM
 */
@Portable
public class Person {

    @PortableProperty
    private  String firstName;
    @PortableProperty
    private String lastName;
    @PortableProperty
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
