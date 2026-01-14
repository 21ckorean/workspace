package study2;

public class CakeTest {
  public static void main(String[] args) {
    CheeseCake c1 = new StrawberryCheeseCake();

    //c1객체에서는 eatStrawberryCheeseCake() 메서드 호출은 불가!

    //형변환을 통해 객체를 변경할 수 있다. int a = (int)10.5;
    StrawberryCheeseCake c2 = (StrawberryCheeseCake)c1;
    c2.eatStrawberryCheeseCake();


    CheeseCake c3 = new CheeseCake();
//    StrawberryCheeseCake c4 = (StrawberryCheeseCake) c3;












//    Cake p3 = new StrawberryCheeseCake();
//    p3.eatCake();
//    Cake p4 = new CheeseCake();
//    p4.eatCake();
//    CheeseCake p6 = new StrawberryCheeseCake();
//    p6.eatCheeseCake();
//    p6.eatCake();
  }
}
