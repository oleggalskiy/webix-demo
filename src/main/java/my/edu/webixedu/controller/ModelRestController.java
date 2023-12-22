package my.edu.webixedu.controller;

import my.edu.webixedu.dao.ModelRepo;
import my.edu.webixedu.domain.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/model")
public class ModelRestController extends AbstractRestController<Model, ModelRepo> {
    @Autowired
    public ModelRestController(ModelRepo repo) {
        super(repo);
    }
}
