package com.aman.gof.student.app.bean;

import lombok.Data;

/**
 * This class defines student POJO class
 */
@Data
public class StudentBean {

    private int id;
    private String name;
    private String gender;
    private String course;
    private String email;
    private long phone;

}