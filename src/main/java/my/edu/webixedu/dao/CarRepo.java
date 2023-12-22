package my.edu.webixedu.dao;

import my.edu.webixedu.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
