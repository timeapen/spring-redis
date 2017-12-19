package com.tim.repository;

import com.tim.model.Student;

import java.util.Map;

public interface StudentRepository {

    void save(Student student);


    void updateStudent(Student student);

    Student findStudent(String id);

    Map<Object, Object> findAllStudents();

    void deleteStudent(String id);

}
