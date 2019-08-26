package com.practice.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "teacher")
@Getter
@Setter
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

//
//    @OneToMany
//    private List<Student> student;
//

}