package pr.github.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pr.github.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

  }