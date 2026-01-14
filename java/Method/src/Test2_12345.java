import java.util.Scanner;

public class Test2_12345 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int result = test1(10, 20);
    System.out.println(result);

    int result2 = test2(sc.nextInt(), sc.nextInt());
    System.out.println(result2);

    int result3 = test3(10,20);
    System.out.println(result3);

    String result4= test4("안녕", "반가워");
    System.out.println(result4);

    String result5 = test5(5);
    System.out.println(result5);
  }

  public static int test1(int a, int b){
    return a + b;
  }

  public static int test2(int a, int b){
    return a * b ;
  }

  public static int test3(int a, int b){
    return a > b ? a : b;
  }

  public static String test4(String str1, String str2){
    return str1 + " " + str2;
  }
  public static String test5(int a){
    String abc = "0";
    if(a >= 90){
      abc = "A";
    }
    else if(a < 90 && a >= 70 ){
      abc = "B";
    }
    else{
      abc = "C";
    }
    return abc;
  }

}
