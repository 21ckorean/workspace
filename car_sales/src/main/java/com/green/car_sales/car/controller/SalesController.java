package com.green.car_sales.car.controller;

import com.green.car_sales.car.dto.SalesDTO;
import com.green.car_sales.car.mapper.SalesMapper;
import com.green.car_sales.car.service.SalesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/sales")
@RestController
public class SalesController {
  private final SalesService salesService;

  //판매정보등록 api
  //(POST) localhost:8080/sales
  @PostMapping("")
  public ResponseEntity<?> regSales(@RequestBody SalesDTO salesDTO){
    try{
      salesService.insertSales(salesDTO);
      return ResponseEntity.status(HttpStatus.OK).build();
    }catch (Exception e){
      log.error("판매정보등록 api 오류", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }


}
