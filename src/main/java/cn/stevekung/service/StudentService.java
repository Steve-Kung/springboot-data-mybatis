package cn.stevekung.service;

import cn.stevekung.pojo.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public void addStudent(Student student);
    public void updateStudent(Student student);
}
