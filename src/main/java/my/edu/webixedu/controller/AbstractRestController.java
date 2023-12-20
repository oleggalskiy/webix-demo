package my.edu.webixedu.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractRestController<T, R extends JpaRepository<T, ?>> {
    protected R repo;
    
    public AbstractRestController(R repo) {
        this.repo = repo;
    }
    
    @GetMapping
    public Page<T> list(@PageableDefault Pageable pegeable) {
        return repo.findAll(pegeable);
    }

    @GetMapping("{id}")
    public T getOne(@PathVariable("id") T obj){
        return obj;
    }
    @PostMapping
    public T add(@RequestBody T obj){
        return repo.save(obj);
    }

    @PutMapping("{id}")
    public T update(@PathVariable("id") T dbObj,@RequestBody T reqObj){
        BeanUtils.copyProperties(reqObj,dbObj, "id");
        return repo.save(dbObj);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")T obj){
        repo.delete(obj);

    }

}