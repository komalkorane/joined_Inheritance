package com.inheritance;

import javax.persistence.Entity;

@Entity
public class Stat extends Subjects {

	String distribution;

	public Stat(int assignment_page, String distribution) {
		super(assignment_page);
		this.distribution = distribution;
	}

	@Override
	public String toString() {
		return "Stat [distribution=" + distribution + "]";
	}

}
