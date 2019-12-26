package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import Service.StudentService;

/**
 * Here we create a RestController using @RestController annotation which makes
 * this class as request handler
 */
@RestController
public class StudentController {
	/** To add dependency in an application we use @Autowired annotation */
	@Autowired
	private StudentService studentservice;

	/**
	 * This method is used to insert value inside table thats why we use postmapping
	 * annotation here
	 */
	@PostMapping("/save")
	public boolean saveStudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);

	}

	/**
	 * This method is used to get all students in table thats why we use
	 * requestmapping annotation here
	 */
	@RequestMapping("/getStudents")
	public List<Student> getAllStudent() {
		return studentservice.getAllStudent();
	}

	/**
	 * This method is used to delete specific students in table thats why we use
	 * deletemapping annotation here
	 */
	@DeleteMapping("/delete")
	public boolean deleteStudent(@RequestParam("id") int student_id) {
		return studentservice.deleteStudent(student_id);
	}

	/**
	 * This method is used to update specific student in table thats why we use
	 * putmapping annotation here
	 */
	@PutMapping("/ustudent")
	public boolean updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}

	/**
	 * This method is used to get specific students in table thats why we use
	 * requestmapping annotation here
	 */
	@RequestMapping("/student")
	public Student getStudentById(@RequestParam("id") int student_id) {
		return studentservice.getStudentById(student_id);
	}
}
