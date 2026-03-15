package com.green.car_sales.car.service;

import com.green.car_sales.car.dto.SalesDTO;
import com.green.car_sales.car.mapper.SalesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalesService {
  private final SalesMapper salesMapper;

  //판매정보 등록 쿼리 실행 기능메서드
  public void insertSales(SalesDTO salesDTO){
    salesMapper.insertSales(salesDTO);
  }
}
