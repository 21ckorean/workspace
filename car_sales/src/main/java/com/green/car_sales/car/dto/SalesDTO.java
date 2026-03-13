package com.green.car_sales.car.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class SalesDTO {
  private int salesNumber;
  private String customerName;
  private String customerPhone;
  private String modelColor;
  private LocalDate saleDate;
  private int modelNumber;
}
