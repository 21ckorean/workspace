

public class TvUser {
  public static void main(String[] args) {

   //인터페이스를 구현한 클래스의 객체를
   //해당 인터페이스 자료형으로 받을 수 있음
   Tv tv = new SamsungTV();
   tv.turnOn();
   tv.volumeUp();
   tv.volumeDown();
   tv.turnOff();

   Tv tv1 = new SamsungTV();             //다형성처럼 Tv에 있는 추상메서드만 객체.()에 들어갈수있음
   SamsungTV tv2 = new SamsungTV();

   SamsungTV[] tvs = new SamsungTV[5];
   tvs[0] = new SamsungTV();
   //tvs[1] = new LgTV();

   Tv[] tt = new Tv[5];
   tt[0] = new SamsungTV();
   tt[1] = new LgTV();

  }
}
