package Static_study;

public class CntTest {
  public static void main(String[] args) {

    Cnt c1 = new Cnt();
    Cnt c2 = new Cnt();

    System.out.println(Cnt.num);

    c1.num = 5;

    System.out.println(c1.num); //5
    System.out.println(c2.num); //5

    Cnt.aaa();
    Math.random();

  }
}
