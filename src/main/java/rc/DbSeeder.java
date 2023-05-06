package rc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private StudentRepository studentRepository;

    public DbSeeder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Student marriot = new Student(
                "Marriot",
                130,
                new Address("Paris", "France")
        );

        Student ibis = new Student(
                "Ibis",
                90,
                new Address("Bucharest", "Romania")
        );

        Student sofitel = new Student(
                "Sofitel",
                200,
                new Address("Rome", "Italy")
        );

        // drop all students
        this.studentRepository.deleteAll();

        //add our students to the database
        List<Student> students = Arrays.asList(marriot, ibis, sofitel);
        this.studentRepository.save(students);
    }
}
