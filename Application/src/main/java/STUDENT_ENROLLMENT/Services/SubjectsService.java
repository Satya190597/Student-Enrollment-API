package STUDENT_ENROLLMENT.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import STUDENT_ENROLLMENT.Repository.SubjectsRepository;
import STUDENT_ENROLLMENT.Bean.Subjects;

@Service
public class SubjectsService 
{
	@Autowired
	private SubjectsRepository myrepository;
	
	public List<Subjects> getAll()
	{
		return (List<Subjects>) myrepository.findAll();
	}
	
	public Subjects getOne(int id)
	{
		return myrepository.findOne(id);
	}
	
	public void save(Subjects subject)
	{
		myrepository.save(subject);
	}
	
	public void update(Subjects subject)
	{
		myrepository.save(subject);
	}
	
	public void delete(int id)
	{
		myrepository.delete(id);
	}
}
