package study2;

import java.sql.SQLOutput;

public class Cake {
  public void eatCake(){
    System.out.println("케익을 맛있게 먹습니다");
  }
}

class CheeseCake extends Cake{
  public void eatCheeseCake(){
    System.out.println("치즈 케익을 맛있게 먹습니다");
  }
}

class StrawberryCheeseCake extends CheeseCake{
  public void eatStrawberryCheeseCake(){
    System.out.println("딸기 치즈 케익을 맛있게 먹습니다");
  }
}
