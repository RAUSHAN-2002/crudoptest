package pr.github.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pr.github.Dto.StudentDto;
import pr.github.Entity.Student;
import pr.github.Repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public String addStudent(StudentDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setPhone(dto.getPhone());

        Student save = studentRepository.save(student);
       return "save student";
    }


    public String DeleteStudentById(long id) {
        studentRepository.deleteById(id);
        return "DELETESTUDENT";
    }

    public StudentDto getStudentById(long id) {
        Optional<Student> byId = studentRepository.findById(id);
        if (byId.isPresent()){
            Student student =byId.get();
            StudentDto dto = new StudentDto();
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            dto.setPhone(student.getPhone());
            dto.setId(student.getId());
            return dto;
        }
        return null;

    }
}
