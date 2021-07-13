package com.example.yebelo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "Numbers")
@Entity
public class EntityClass {

	private Integer newNumber;
	private Integer oldNumber;

	public Integer getNewNumber() {
		return newNumber;
	}

	public void setNewNumber(Integer newNumber) {
		this.newNumber = newNumber;
	}

	public Integer getOldNumber() {
		return oldNumber;
	}

	public void setOldNumber(Integer oldNumber) {
		this.oldNumber = oldNumber;
	}

	public EntityClass() {
		super();
	}

	public EntityClass(Integer newNumber, Integer oldNumber) {
		super();
		this.newNumber = newNumber;
		this.oldNumber = oldNumber;
	}

}
