package com.green.car_sales.car.service;

import com.green.car_sales.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //final붙은 필드(맴버변수)만들고, 서비스생성자 자동으로만드려고 씀
public class CarService {
  private final CarMapper carMapper;
}
