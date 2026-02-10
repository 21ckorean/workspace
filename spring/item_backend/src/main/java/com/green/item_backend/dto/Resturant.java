package com.green.item_backend.dto;

//식당
public class Resturant {
  private Cookable chef = new Chef2();

  public void oper(){
    System.out.println("서버는 서빙을 함");
    chef.cook();
  }


}
