package jpa.entitymodels;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id //annotates that sEmail is PK
	@Column(name = "sEmail", length = 50, nullable = false)
	private String email;
	
	@Column(name ="sName", length = 50, nullable = false)
	private String fullname;
	
	@Column(name = "sPass", length = 50, nullable = false)
	private String password;
	
	@ManyToMany(targetEntity = Course.class)
	private List<Course> sCourses;
	
	
	public Student(){}
	
	public Student(String email, String fullname, String password) {
		this.email = email;
		this.fullname = fullname;
		this.password = password;
		
	}

	public Student(String email, String fullname, String password, List<Course> sCourses) {
		super();
		this.email = email;
		this.fullname = fullname;
		this.password = password;
		this.sCourses = sCourses = new ArrayList<>();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", fullname=" + fullname + ", password=" + password + ", sCourses="
				+ sCourses + "]";
	}

	
	}

