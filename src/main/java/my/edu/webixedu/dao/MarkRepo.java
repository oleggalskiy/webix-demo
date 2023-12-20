package my.edu.webixedu.dao;

import my.edu.webixedu.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
