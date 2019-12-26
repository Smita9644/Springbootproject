package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.StudentDao;
import Model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentdaoIn;

	public boolean saveStudent(Student student) {
		return studentdaoIn.saveStudent(student);
	}

	public List<Student> getAllStudent() {
		return studentdaoIn.getStudents();
	}

	public boolean deleteStudent(int student_id) {
		return studentdaoIn.deleteStudent(student_id);
	}

	public boolean updateStudent(Student student) {
		return studentdaoIn.updateStudent(student);
	}

	public Student getStudentById(int student_id) {
		return studentdaoIn.getStudentByID(student_id);
	}
}
