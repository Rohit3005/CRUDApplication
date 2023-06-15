package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;

    private String empAddress;

    private long empContactNumber;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy" , timezone = "Asia/Kolkata")
    private Date empDOB;


}
