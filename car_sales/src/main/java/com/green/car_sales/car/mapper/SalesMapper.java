package com.green.car_sales.car.mapper;

import com.green.car_sales.car.dto.SalesDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalesMapper {

  //판매정보 등록 쿼리 실행 메서드
  void insertSales(SalesDTO salesDTO);
}
