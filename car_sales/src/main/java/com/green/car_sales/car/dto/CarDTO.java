package com.green.car_sales.car.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {
  private int modelNumber;
  private String modelName;
  private int modelPrice;
  private String manufacturer;
}
