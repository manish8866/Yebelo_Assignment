package com.example.yebelo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Table(name = "Numbers")
@Entity
public class EntityClass {

	@Id
	@GeneratedValue()
	private Integer categoryCode;
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

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public EntityClass(Integer categoryCode, Integer newNumber, Integer oldNumber) {
		super();
		this.categoryCode = categoryCode;
		this.newNumber = newNumber;
		this.oldNumber = oldNumber;
	}

}
