package cn.stevekung.controller;

import cn.stevekung.pojo.Student;
import cn.stevekung.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired
    StudentService studentService;
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable("id") Integer id){
        Student studentById = studentService.getStudentById(id);
        return studentById;
    }
    @GetMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id){
        studentService.deleteStudentById(id);
    }
    @GetMapping("/addStudent")
    public void addStudent(){
        Student student = new Student("stevekung01", 1);
        studentService.addStudent(student);
    }
    @GetMapping("/updateStudent")
    public void updateStudent(){
        Student student = new Student(4, "steve04", 1);
        studentService.updateStudent(student);
    }
}
