package za.ac.cputassignment.Controller.personController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.person.Student;
import za.ac.cputassignment.service.service.PersonService.StudentService;

import java.util.Set;

@RestController
@RequestMapping("/Student")
public class StudentController {



    @Autowired
    @Qualifier("ServiceImpl")
    private StudentService service;


    @PostMapping("/create")
    @ResponseBody
    public Student create(Student student)
    {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Student update(Student student)
    {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<Student> getAll()
    {
        return service.getAll();
    }






}
