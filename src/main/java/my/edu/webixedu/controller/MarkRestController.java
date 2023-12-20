package my.edu.webixedu.controller;

import my.edu.webixedu.dao.MarkRepo;
import my.edu.webixedu.domain.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepo> {
    @Autowired
    public MarkRestController(MarkRepo repo) {
        super(repo);
    }
}
