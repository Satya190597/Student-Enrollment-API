package STUDENT_ENROLLMENT.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import STUDENT_ENROLLMENT.Repository.StudentRepository;
import STUDENT_ENROLLMENT.Bean.Student;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository myrepository;
	
	public List<Student> getAll()
	{
		return (List<Student>) myrepository.findAll();
	}
	
	public Student getOne(int id)
	{
		return myrepository.findOne(id);
	}
	
	public void save(Student student,int id)
	{
		myrepository.save(student);
	}
	
	public void update(Student student,int id)
	{
		myrepository.save(student);
	}
	
	public void delete(int id)
	{
		myrepository.delete(id);
	}
}
