package com.ccp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "projects")
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project extends AbstractEntity {

    @Column
    private String name;
    @Column
    private Integer duration;
    @Column
    private Integer income;
    @Column
    private List<Employee> workers;


}
