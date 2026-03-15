package com.green.car_sales.car.mapper;

import com.green.car_sales.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {

  //차량등록 쿼리 실행 메서드
  void insertCar(CarDTO carDTO);

  //차량리스트 조회 쿼리 실행 메서드
  List<CarDTO> selectCarList();
}
