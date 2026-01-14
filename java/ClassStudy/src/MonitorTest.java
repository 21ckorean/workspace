public class MonitorTest {
  public static void main(String[] args) {

    Monitor m1 = new Monitor(1000);
    System.out.println(m1.price);

    Monitor m2 = new Monitor();

    Monitor m3 = new Monitor("java");
  }
}
