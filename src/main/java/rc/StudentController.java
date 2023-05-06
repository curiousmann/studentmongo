package rc;

//import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/all")
    public List<Student> getAll(){
        List<Student> students = this.studentRepository.findAll();

        return students;
    }

    @PutMapping
    public void insert(@RequestBody Student student){
        this.studentRepository.insert(student);
    }

    @PostMapping
    public void update(@RequestBody Student student){
        this.studentRepository.save(student);
    }

//    @GetMapping("/{id}")
//    public Student getById(@PathVariable("id") String id){
//        Student student = this.studentRepository.findById(id);
//
//        return student;
//    }
//
//    @GetMapping("/address/{city}")
//    public List<Student> getByCity(@PathVariable("city") String city){
//        List<Student> students = this.studentRepository.findByCity(city);
//
//        return students;
//    }
//
//    @GetMapping("/country/{country}")
//    public List<Student> getByCountry(@PathVariable("country") String country){
//        // create a query class (QStudent)
//        QStudent qStudent = new QStudent("student");
//
//        // using the query class we can create the filters
//        BooleanExpression filterByCountry = qStudent.address.country.eq(country);
//
//        // we can then pass the filters to the findAll() method
//        List<Student> students = (List<Student>) this.studentRepository.findAll(filterByCountry);
//
//        return students;
//    }
}
