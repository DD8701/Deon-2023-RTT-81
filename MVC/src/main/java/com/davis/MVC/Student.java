/*
 * Step 1: Creating a Model
 * 
 * The Model contains only the pure application data; it contains 
 * no logic describing how to present the data to a user.
 * 
 * Basically, we may add getters and setters, as well as constructors 
 * and the toString() method here.
 */

package com.davis.MVC;

public class Student {

	private String rollnum;
	private String name;

	public String getRollnum() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
