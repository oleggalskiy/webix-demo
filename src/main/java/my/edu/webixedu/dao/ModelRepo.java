package my.edu.webixedu.dao;

import my.edu.webixedu.domain.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepo extends JpaRepository<Model, Long> {

    @Override
    @EntityGraph(attributePaths = {"mark"})
    Page<Model> findAll(Pageable pageable);
}
