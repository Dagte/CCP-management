package com.ccp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends AbstractEntity {

    @Column
    private String name;
    @Column
    private String surname;




}
