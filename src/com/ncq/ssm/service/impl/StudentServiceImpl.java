package com.ncq.ssm.service.impl;

import com.ncq.ssm.dao.CourseDao;
import com.ncq.ssm.dao.StudentDao;
import com.ncq.ssm.entity.Course;
import com.ncq.ssm.entity.Student;
import com.ncq.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/1/19/019.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private CourseDao courseDao;

    @Override
    public List <Student> findAllStudents() {
        return studentDao.queryAllStudents();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentDao.queryStudentById();
    }

    @Override
    public List <Course> findAllCourses() {
        return courseDao.queryAllCourses();
    }


}
