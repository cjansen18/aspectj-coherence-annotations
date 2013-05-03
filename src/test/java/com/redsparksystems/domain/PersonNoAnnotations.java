package com.redsparksystems.domain;

/**
 * User: Christopher M. Jansen
 * Date: 4/19/13
 * Time: 3:41 PM
 * Red Spark Systems
 */
public class PersonNoAnnotations {
    private String firstName;
    private String lastName;
    private String middleName;
    private String age;
    private String brainSize;



	public String getBrainSize() {
		return brainSize;
	}

	public void setBrainSize(String brainSize) {
		this.brainSize = brainSize;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

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
