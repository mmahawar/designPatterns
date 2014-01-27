package designPatterns.j2ee.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestStudentDaoImpl {

	@Test
	public void testShouldFetchAllStudents() {
		StudentDao studentDao = new StudentDaoImpl();

		List<Student> allStudents = studentDao.getAllStudents();
		Assert.assertEquals(2, allStudents.size());
	}

	@Test
	public void testShouldUpdateAStudents() {
		StudentDao studentDao = new StudentDaoImpl();

		Student student = studentDao.getStudent(0);
		String studentName = "Michael";
		student.setName(studentName);
		studentDao.updateStudent(student);
		
		Student updateStudent = studentDao.getStudent(0);
		Assert.assertEquals(studentName, updateStudent.getName());
	}

	@Test
	public void testShouldRemoveAStudents() {
		StudentDao studentDao = new StudentDaoImpl();
		
		studentDao.deleteStudent(0);
		
		List<Student> allStudents = studentDao.getAllStudents();
		Assert.assertEquals(1, allStudents.size());
	}
	
	

}
