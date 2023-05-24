package com.example.demo2.beans;

import com.example.demo2.dto.StudentDto;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@SessionScoped
@Named
public class HelloBean implements Serializable {
    private StudentDto student = new StudentDto();

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public String hello() {
        return "privet";
    }
}
