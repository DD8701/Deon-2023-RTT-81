package com.davis.perscholas.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "teachmm")
public class TeacherMM implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String salary;
	private String teachrName;
	
	@ManyToMany(targetEntity = Cohort.class)
	private Set cohortSet;
	
	public TeacherMM() {}

	public TeacherMM(String salary, String teachrName, Set cohortSet) {
		super();
		this.salary = salary;
		this.teachrName = teachrName;
		this.cohortSet = cohortSet;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeachrName() {
		return teachrName;
	}

	public void setTeachrName(String teachrName) {
		this.teachrName = teachrName;
	}

	public Set getCohortSet() {
		return cohortSet;
	}

	public void setCohortSet(Set cohortSet) {
		this.cohortSet = cohortSet;
	}

	@Override
	public String toString() {
		return "TeacherMM [teacherId=" + teacherId + ", salary=" + salary + ", teachrName=" + teachrName
				+ ", cohortSet=" + cohortSet + "]";
	}
	
	
}