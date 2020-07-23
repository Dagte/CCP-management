package com.ccp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
//@ToString
//@Data
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "income")
    private Integer income;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<Employee> workers;


}
