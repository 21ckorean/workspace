import java.util.Scanner;

public class Test1_678910 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    test7("a", "b");

    int a = sc.nextInt();
    test8(a);

    test9(sc.nextInt(), sc.nextInt());

    test10(15);
  }

  public static void test6(int a, int b){


  }

  public static void test7(String a, String b){
    a = "문자열1"; b = "문자열2";
    System.out.println(a);
    System.out.println(b);
  }
  public static void test8(int num){
    System.out.println(num);
  }
  public static void test9(int a, int b){
    System.out.println(a + b);
  }
  public static void test10(int a){
    if(a % 2 == 0){
      System.out.println("짝수입니다");
    }
    else{
      System.out.println("홀수입니다");
    }
  }
}

