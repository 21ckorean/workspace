public class Test1_12345 {
  public static void main(String[] args) {
    System.out.print("Test1 : ");
    test1("안녕하세요");
    System.out.println();

    int a = 20;
    System.out.print("Test2 : ");
    test2(a);
    System.out.println();

    String name = "3번문제";
    System.out.print("Test3 : ");
    test3(name);
    System.out.println();

    int c = 10; int d = 20;
    System.out.print("Test4 : ");
    test4(c, d);
    System.out.println();

    int e = 10; int f = 20; int g = 30;
    System.out.print("Test5 : ");
    test5(e, f, g);
  }

  public static void test1(String hello){
    System.out.println(hello);
  }
  public static void test2(int a){
    System.out.println(a);
  }
  public static void test3(String name){
    System.out.println(name);
  }
  public static void test4(int c, int d){
    System.out.println(c + d);
  }
  public static void test5(int e, int f, int g){
    System.out.println(e * f * g);
  }


}
