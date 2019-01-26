package com.ncq.ssm.controller;

import com.ncq.ssm.entity.Course;
import com.ncq.ssm.entity.Student;
import com.ncq.ssm.service.CourseService;
import com.ncq.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2019/1/19/019.
 */
@Controller
@RequestMapping("student")
public class StudentController {
   @Autowired
    private StudentService studentService;
   @Autowired
    private CourseService courseService;

   @RequestMapping("findAll")
    public String findAll(Model model){
       List<Student> stus=studentService.findAllStudents();
       model.addAttribute( "stus",stus );
       return "student/allstudents";
   }

   @RequestMapping("input")
    public ModelAndView input(Integer id){
        ModelAndView mv = new ModelAndView( "student/input" );

            //�����Ƿ���id�ж��Ƿ������������޸Ĵ˲���
       if(id!=null){
            //���޸ģ�����id����ѧ��
           Student student=studentService.findStudentById(id);
           mv.addObject( "stu",student );
       }
       //������пγ�
       List<Course> courses = studentService.findAllCourses();

   }

}
