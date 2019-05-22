package za.ac.cputassignment.Controller.personController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cputassignment.domain.person.StudentInfo;
import za.ac.cputassignment.service.service.PersonService.StudentInfoService;

import java.util.Set;

@RestController
@RequestMapping("/StudentInfor")
public class StudentInforController {



    @Autowired
    @Qualifier("ServiceImpl")
    private StudentInfoService service;


    @PostMapping("/create")
    @ResponseBody
    public StudentInfo create(StudentInfo stud)
    {
        return service.create(stud);
    }

    @PostMapping("/update")
    @ResponseBody
    public StudentInfo update(StudentInfo stud)
    {
        return service.update(stud);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Set<StudentInfo> getAll()
    {
        return service.getAll();
    }





}
