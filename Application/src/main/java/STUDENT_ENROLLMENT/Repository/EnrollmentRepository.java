package STUDENT_ENROLLMENT.Repository;

import org.springframework.data.repository.CrudRepository;
import STUDENT_ENROLLMENT.Bean.Enrollment;

public interface EnrollmentRepository extends CrudRepository<Enrollment,Integer> 
{

}
