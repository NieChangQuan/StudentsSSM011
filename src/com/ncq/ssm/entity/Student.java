package com.ncq.ssm.entity;

import com.ncq.ssm.entity.Course;

import java.util.Date;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public class Student {
    private Integer id;
    private String name;
    private String password;
    private int age;
    private Date createTime;
    private Course course;

    public Student() {
    }

    public Student(Integer id, String name, String password, int age, Date createTime, Course course) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.createTime = createTime;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", createTime=" + createTime +
                ", course=" + course +
                '}';
    }
}
