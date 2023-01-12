package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	int assignment_page;

	public Subjects(int assignment_page) {
		super();
		this.assignment_page = assignment_page;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", assignment_page=" + assignment_page + "]";
	}

}
