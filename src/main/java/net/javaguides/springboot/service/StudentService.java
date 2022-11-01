package net.javaguides.springboot.service;
import net.javaguides.springboot.model.Student;
import java.util.List;

public interface StudentService {
	List<Student> getAllStudent();	
	void saveStudent(Student student);
	Student getStudentById(long id);
	void deleteStudentById(long id);
}
