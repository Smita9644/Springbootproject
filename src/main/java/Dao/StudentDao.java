package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Model.Student;

@Transactional
@Repository
/**
 * When we have to access database from any class the we use @Repository
 * annotation
 */
public class StudentDao implements StudentDaoIn {
	@Autowired
	private SessionFactory sessionfactory;

	/**
	 * In the given below method use SessionFactory object to insert object into
	 * database
	 */
	@Override
	public boolean saveStudent(Student student) {
		boolean status = false;
		sessionfactory.getCurrentSession().save(student);
		status = true;
		return status;
	}

	/**
	 * Given below is the method which gives all the student in the table and here
	 * we use jpql
	 */
	@Override
	public List<Student> getStudents() {

		String jpql = "select s from Student s";
		return sessionfactory.getCurrentSession().createQuery(jpql, Student.class).getResultList();
	}

	/** In below method we can delete specific object from database */
	@Override
	public boolean deleteStudent(int student_id) {
		Session hs = sessionfactory.getCurrentSession();
		Student s = hs.get(Student.class, student_id);
		if (s != null) {
			hs.delete(s);
			return true;
		} else
			return false;
	}

	/** In below method we can get specific object from database */
	@Override
	public Student getStudentByID(int student_id) {
		Session hs = sessionfactory.getCurrentSession();
		Student s = hs.get(Student.class, student_id);
		return s;
	}

	/** In below method we can update specific object from database */
	@Override
	public boolean updateStudent(Student student) {
		boolean status = false;
		if (student != null) {
			sessionfactory.getCurrentSession().update(student);
			return true;
		} else
			return status;
	}
}
