package pr.github.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pr.github.Dto.StudentDto;
import pr.github.Entity.Student;
import pr.github.Service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

 @PostMapping("/student")
 public String addEmployee(@RequestBody StudentDto dto){
     String s = studentService.addStudent(dto);
     return s;
 }
    @GetMapping("/str"){
   public String getstr(){
     return "getstr";
       
   }
        
    }

    @DeleteMapping("/{id}")
    public String DeleteStudent(@PathVariable long id){
        String s = studentService.DeleteStudentById(id);
        return s;


    }

    @GetMapping
    public ResponseEntity<?> getStudentById(@RequestParam long id){
        StudentDto studentById = studentService.getStudentById(id);

        return new ResponseEntity<>(studentById,HttpStatus.OK);
    }
}
