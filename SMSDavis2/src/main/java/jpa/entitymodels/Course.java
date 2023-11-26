package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cId", nullable = false)
	private int Id;

	@Column(name = "cName", length = 50, nullable = false)
	private String courseName;

	@Column(name = "cInstructorName", length = 50, nullable = false)
	private String instructorName;

	public Course() {
	}

	public Course(String courseName, String instructorName) {
		super();
		this.courseName = courseName;
		this.instructorName = instructorName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", courseName=" + courseName + ", instructorName=" + instructorName + "]";
	}

}
