package cn.stevekung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jdbc")
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // CRUD
    @GetMapping("/allStudents")
    public List<Map<String, Object>> allStudents(){
        // Map中的String表示为数据库中的字段名，Object为数据库中的字段值
        String sql = "select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }
}
