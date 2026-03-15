package com.green.car_sales.car.service;

import com.green.car_sales.car.dto.CarDTO;
import com.green.car_sales.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //final붙은 필드(맴버변수)만들고, 서비스생성자 자동으로만드려고 씀
public class CarService {
  private final CarMapper carMapper;

  //차량등록 쿼리 실행 기능메서드
  public void insertCar(CarDTO carDTO){
    carMapper.insertCar(carDTO);
  }

  //차량리스트 조회 쿼리 실행 기능메서드
  public List<CarDTO> selectCarList(){
    return carMapper.selectCarList();
  }

}
