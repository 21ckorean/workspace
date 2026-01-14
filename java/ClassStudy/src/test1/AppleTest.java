package test1;

import test1.inner.Banana;
import test2.Orange;

import java.util.Scanner;

public class AppleTest {
  public static void main(String[] args) {

    //다른 패키지에 있는 클래스를 사용하려면 반드시 import를 해야함
    Banana a = new Banana();
    Scanner sc = new Scanner(System.in);

    //사과 객체
    Apple apple = new Apple();
    //apple.price; 접근 가능 왜why? 같은 패키지에 있는 default 접근제한자라서..




    //오렌지 객체
    Orange orange = new Orange();
    //orange.price; 접근 불가
    orange.orange();
  }
}
//java.util.aaa -> java/util/aaa