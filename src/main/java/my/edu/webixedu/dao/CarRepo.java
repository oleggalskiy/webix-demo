package my.edu.webixedu.dao;

import my.edu.webixedu.domain.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

    @Override
    @EntityGraph(attributePaths = {"model.mark"})
    Page<Car> findAll(Pageable pageable);
}
