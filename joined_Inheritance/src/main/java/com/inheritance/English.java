package com.inheritance;

import javax.persistence.Entity;

@Entity
public class English extends Subjects {

	String grammer;

	public English(int assignment_page, String grammer) {
		super(assignment_page);
		this.grammer = grammer;
	}

	@Override
	public String toString() {
		return "English [grammer=" + grammer + "]";
	}

}
