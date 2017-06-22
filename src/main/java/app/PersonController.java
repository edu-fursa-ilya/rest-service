package app;

import app.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/person")
    public Person print(@RequestParam(value = "name") String name,
                        @RequestParam(value = "surname") String surname,
                        @RequestParam(value = "age") int age,
                        @RequestParam(value = "salary") int salary,
                        @RequestParam(value = "profession") String profession) {
        return new Person(name, surname, age, salary, profession);
    }


}
