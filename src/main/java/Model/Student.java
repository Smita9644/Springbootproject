package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * When we have to map java class with database then we use entity annotation
 */
@Entity
/**
 * When we want to give specific name to database table hen we use table
 * annotation
 */
@Table(name = "student")
public class Student {
	/** When we have to set any field as a primary key the we use id annotation */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String student_name;
	private String student_email;
	private String student_branch;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public String getStudent_branch() {
		return student_branch;
	}

	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}

}
