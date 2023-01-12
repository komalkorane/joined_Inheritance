package com.inheritance;

import javax.persistence.Entity;

@Entity
public class Maths extends Subjects {

	int marks;

	public Maths(int assignment_page, int marks) {
		super(assignment_page);
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Maths [marks=" + marks + "]";
	}

}
