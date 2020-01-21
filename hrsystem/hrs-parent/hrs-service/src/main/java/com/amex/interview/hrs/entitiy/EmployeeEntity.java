package com.amex.interview.hrs.entitiy;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="EMPLOYEE")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class EmployeeEntity {
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name="NAME")
    private String name;

    @Column(name="TITLE")
    private String title;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="manager_id")
    private EmployeeEntity manager;

    @OneToMany(mappedBy="manager")
    private Set<EmployeeEntity> reports = new HashSet<>();
}
