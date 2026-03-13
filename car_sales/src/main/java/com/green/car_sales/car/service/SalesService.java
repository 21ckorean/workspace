package com.green.car_sales.car.service;

import com.green.car_sales.car.mapper.SalesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesService {
  private final SalesMapper salesMapper;
}
