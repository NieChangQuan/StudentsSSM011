package com.ncq.ssm.dao;

import com.ncq.ssm.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public interface StudentDao {

    List<Student> queryAllStudents();

    Student queryStudentById();


}
