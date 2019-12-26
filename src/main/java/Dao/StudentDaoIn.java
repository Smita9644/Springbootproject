package Dao;

import java.util.List;

import Model.Student;

public interface StudentDaoIn {

	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public Student getStudentByID(int student_id);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(int student_id);
}
