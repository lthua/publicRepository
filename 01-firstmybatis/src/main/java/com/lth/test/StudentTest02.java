package com.lth.test;

import com.lth.bean.Student;
import com.lth.dao.StudentDao;
import com.lth.dao.impl.StudentDaoImpl;
import org.junit.Test;


public class StudentTest02 {
    @Test
    public void insertStudent(){
        StudentDao studentdao = new StudentDaoImpl();
        Student student = new Student("刘德华",21,99.9);
        studentdao.insertStudetn(student);
    }
}
