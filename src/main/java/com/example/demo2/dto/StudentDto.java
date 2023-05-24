package com.example.demo2.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentDto implements Serializable {
    private int id;
    private String name;
    private double rating;
}
