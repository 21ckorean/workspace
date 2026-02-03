package test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max;
    int mid;
    int min;

    if(a > b && a > c){
      max = a;
      mid = b > c ? b : c;
      min = c < b ? c : b;
    }
    else if(b > a && b > c){
      max = b;
      mid = a > c ? a : c;
      min = c > a ? a : c;
    }
    else{
      max = c;
      mid = a > b ? a : b;
      min = b > a ? a : b;
    }

    System.out.println("가장 큰 수 : " + max + ", 중간 수 : " + mid + ", 가장 작은 수 : " + min);

  }
}
