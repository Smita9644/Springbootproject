package Service;

import java.util.List;

import Model.Student;

public interface StudentService {
	public boolean saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public boolean deleteStudent(int student_id);
	
	public boolean updateStudent(Student student);
	
	public Student getStudentById(int student_id);
}
