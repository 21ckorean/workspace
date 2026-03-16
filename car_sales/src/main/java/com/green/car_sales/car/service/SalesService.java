package com.green.car_sales.car.service;

import com.green.car_sales.car.dto.SalesDTO;
import com.green.car_sales.car.mapper.SalesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SalesService {
  private final SalesMapper salesMapper;

  //판매정보 등록 쿼리 실행 기능메서드
  public void insertSales(SalesDTO salesDTO){
    salesMapper.insertSales(salesDTO);
  }

  //판매정보 목록 조회 쿼리 실행 기능메서드
  public List<Map<String, Object>> selectSalesList(){
    return salesMapper.selectSalesList();
  }

}
