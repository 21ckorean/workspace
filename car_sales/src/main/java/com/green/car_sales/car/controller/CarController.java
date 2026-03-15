package com.green.car_sales.car.controller;

import com.green.car_sales.car.dto.CarDTO;
import com.green.car_sales.car.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //로그 쓰려고 만듬
@RequiredArgsConstructor //final필드 만들어서 생성자 자동으로만들고 생성자에 서비스 주입해서 사용하려고씀
@RequestMapping("/car") //모든 URL에 자동으로 붙게함
@RestController // JSON으로 변환한 데이터 리액트한테 주려고 씀
public class CarController {
  private final CarService carService;

  //차량등록 api
  //(Post) localhost:8080/car
  @PostMapping("")
  public ResponseEntity<?> regCar(@RequestBody CarDTO carDTO){
    try{
      carService.insertCar(carDTO);
      return ResponseEntity.status(HttpStatus.OK).build();
    }catch (Exception e){
      log.error("차량 등록 api 오류", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //차량 목록 조회 api
  //(GET) localhost:8080/car
  @GetMapping("")
  public ResponseEntity<?> getCarList(){
    try{
      List<CarDTO> list = carService.selectCarList();
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("차량목록조회 api 오류", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }


}
