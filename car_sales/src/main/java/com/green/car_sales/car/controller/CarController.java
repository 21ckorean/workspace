package com.green.car_sales.car.controller;

import com.green.car_sales.car.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //로그 쓰려고 만듬
@RequiredArgsConstructor //final필드 만들어서 생성자 자동으로만들고 생성자에 서비스 주입해서 사용하려고씀
@RequestMapping("/carSales") //모든 URL에 자동으로 붙게함
@RestController // JSON으로 변환한 데이터 리액트한테 주려고 씀
public class CarController {
  private final CarService carService;


}
