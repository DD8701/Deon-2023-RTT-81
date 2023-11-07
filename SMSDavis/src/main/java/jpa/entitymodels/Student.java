package jpa.entitymodels;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/*
 * This is the persistent MODEL class.
 */
@Entity
@Table
public class Student {
	
	@Id
	@Column(name = "sEmail", length = 50, nullable = false)
	private String sEmail;
	
	@Column(name = "sName", length = 50, nullable = false)
	private String sName;
	
	@Column(name = "sPass", length = 50, nullable = false)
	private String sPass;
	
	@ManyToMany(targetEntity = Course.class)
	private List<Course> sCourses;


public Student() {}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPass() {
		return sPass;
	}
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	public List<Course> getsCourses() {
		return sCourses;
	}
	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses="
				+ sCourses + "]";
	}

	

	
	}
