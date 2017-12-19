package STUDENT_ENROLLMENT.Repository;

import org.springframework.data.repository.CrudRepository;
import STUDENT_ENROLLMENT.Bean.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
