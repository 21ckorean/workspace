package com.green.rest_study;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@RestController
public class Emp {
  private int empNum;
  private String empName;
  private String department;
  private int salary;
  private String rank;
}
