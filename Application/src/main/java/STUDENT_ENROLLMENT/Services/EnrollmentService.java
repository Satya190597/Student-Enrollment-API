package STUDENT_ENROLLMENT.Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import STUDENT_ENROLLMENT.Bean.Enrollment;
import STUDENT_ENROLLMENT.Repository.EnrollmentRepository;


@Service
public class EnrollmentService 
{
	@Autowired
	private EnrollmentRepository myrepository;
	@PersistenceContext
	private EntityManager myentitymanager;
	@SuppressWarnings("unchecked")
	public List<Enrollment> getAll()
	{
		String query = "SELECT "
				+ "ENROLL.ENROLLMENT_ID,"
				+ "STU.STUDENT_NAME,"
				+ "SUB.SUBJECT_NAME "
				+ "FROM "
				+ "Enrollment ENROLL"
				+ ",Subjects SUB"
				+ ",Student STU "
				+ "WHERE "
				+ "ENROLL.SUBJECT_ID=SUB.SUBJECT_ID "
				+ "AND "
				+ "ENROLL.STUDENT_ID=STU.STUDENT_ID";
		return  (List<Enrollment>)myentitymanager.createQuery(query).getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Enrollment> getOne(String id)
	{
		String query = "SELECT "
				+ "ENROLL.ENROLLMENT_ID,"
				+ "STU.STUDENT_NAME,"
				+ "SUB.SUBJECT_NAME "
				+ "FROM "
				+ "Enrollment ENROLL"
				+ ",Subjects SUB"
				+ ",Student STU "
				+ "WHERE "
				+ "ENROLL.SUBJECT_ID=SUB.SUBJECT_ID "
				+ "AND "
				+ "ENROLL.STUDENT_ID=STU.STUDENT_ID "
				+ "AND ENROLL.STUDENT_ID=:id";
		return (List<Enrollment>)myentitymanager.createQuery(query).setParameter("id",id).getResultList();
	}
	
	public void save(Enrollment enrollment)
	{
		myrepository.save(enrollment);
	}
	
	public void update(Enrollment enrollment)
	{
		myrepository.save(enrollment);
	}
	
	public void delete(int id)
	{
		myrepository.delete(id);
	}
}
