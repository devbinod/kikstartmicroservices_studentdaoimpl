package np.com.pantbinod.studentdaoimpl;

import np.com.pantbinod.studentdaoimpl.dal.resp.StudentException;
import np.com.pantbinod.studentdaoimpl.dal.resp.StudentRepository;
import np.com.pantbinod.studentdaoimpl.modal.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdaoimplApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent(){

        Student student = new Student();
        student.setName("Binod");
        student.setCourse("Java");
        student.setFee(333.3d);
        studentRepository.save(student);

    }

    @Test
    public void testFindOneStudent(){

        Optional<Student> student = studentRepository.findById(1L);
        System.out.println(student.toString());
    }



    @Test
    public void testDeleteStudent(){
        Student student =new Student();
        student.setId(1l);
        studentRepository.delete(student);
    }
}
