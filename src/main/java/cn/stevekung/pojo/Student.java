package cn.stevekung.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer tid;

    public Student(String name, Integer tid){
        this.name = name;
        this.tid = tid;
    }
}
