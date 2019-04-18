package np.com.pantbinod.studentdaoimpl.dal.resp;

import np.com.pantbinod.studentdaoimpl.modal.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
