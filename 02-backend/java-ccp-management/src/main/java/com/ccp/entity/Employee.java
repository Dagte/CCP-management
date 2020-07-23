package com.ccp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
//@Builder
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
//    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Project project;




}
