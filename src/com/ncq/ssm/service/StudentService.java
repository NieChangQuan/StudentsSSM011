package com.ncq.ssm.service;

import com.ncq.ssm.entity.Course;
import com.ncq.ssm.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public interface StudentService {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    List<Course> findAllCourses();
}
