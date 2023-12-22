package my.edu.webixedu.controller;

import my.edu.webixedu.dao.CarRepo;
import my.edu.webixedu.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarRestController extends AbstractRestController<Car, CarRepo>{
    @Autowired
    public CarRestController(CarRepo repo) {
        super(repo);
    }
}
