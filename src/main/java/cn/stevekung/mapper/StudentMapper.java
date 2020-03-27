package cn.stevekung.mapper;

import cn.stevekung.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    // CRUD
    @Select("select * from student")
    public List<Student> getAllStudents();

    @Select("select * from student where id = #{id}")
    public Student getStudentById(Integer id);

    @Delete("delete from student where id = #{id}")
    public void deleteStudentById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into student(name, tid) values(#{name},#{tid})")
    public void addStudent(Student student);

    @Update("update student set name = #{name}, tid = #{tid} where id = #{id}")
    public void updateStudent(Student student);


}
