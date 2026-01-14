import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("생성할 배열의 길이 : ");
    int[] arr = new int[sc.nextInt()];

    for(int i = 0; i < arr.length; i++){
      arr[i] =2;
    }

  }
}
