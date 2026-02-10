package com.green.item_backend.dto;

//요리사
public class Chef implements Cookable {

  public void cook(){
    System.out.println("요리");
  }

}

class Chef2 implements Cookable{
  public void cook(){
    System.out.println("요리11");
  }
}

interface Cookable{
  void cook();
}
