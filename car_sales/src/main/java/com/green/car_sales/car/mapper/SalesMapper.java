package com.green.car_sales.car.mapper;

import com.green.car_sales.car.dto.SalesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SalesMapper {

  //판매정보 등록 쿼리 실행 메서드
  void insertSales(SalesDTO salesDTO);

  //판매정보 목록 조회 쿼리 실행 메서드
  List<Map<String, Object>> selectSalesList();
}
