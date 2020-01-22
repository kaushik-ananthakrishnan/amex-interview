package com.amex.interview.hrs.entitiy;

import com.amex.interview.hrs.constants.ApiConstants;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name=ApiConstants.EMPLOYEE_TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class EmployeeEntity {
    @Id
    @Column(name=ApiConstants.EMPLOYEE_ID_COLUMN_NAME)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name=ApiConstants.EMPLOYEE_NAME_COLUMN_NAME)
    private String name;

    @Column(name=ApiConstants.EMPLOYEE_TITLE_COLUMN_NAME)
    private String title;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name=ApiConstants.EMPLOYEE_MANAGER_ID_JOIN_COLUMN_NAME)
    private EmployeeEntity manager;

    @OneToMany(mappedBy=ApiConstants.EMPLOYEE_MANAGER_MAP_NAME)
    private Set<EmployeeEntity> reports = new HashSet<>();
}
