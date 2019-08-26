package com.practice.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

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

//    @ManyToOne
//    private Teacher teacher;

}

