package com.ccp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
@ToString
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project extends  AbstractEntity{

    @Column
    private String name;

    @Column
    private Integer duration;

    @Column
    private Integer income;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<Employee> workers;


}
