package STUDENT_ENROLLMENT.Configuration;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import STUDENT_ENROLLMENT.Services.EnrollmentService;
import STUDENT_ENROLLMENT.Bean.Enrollment;

@RestController
public class EnrollmentConfig 
{
	@Autowired
	private EnrollmentService myservice;
	@RequestMapping("/enrollment")
	public List<Enrollment> select()
	{
		return myservice.getAll();
	}
	@RequestMapping("/enrollment/{id}")
	public List<Enrollment> selectId(@PathVariable String id)
	{
		return myservice.getOne(id);
	}
}
