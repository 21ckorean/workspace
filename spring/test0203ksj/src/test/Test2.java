package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] lotto = new int[6];

    for (int i = 0; i < lotto.length; i++) {
      lotto[i] = (int) (Math.random() * 45 + 1);
    }

    System.out.println(Arrays.toString(lotto));
  }
}
