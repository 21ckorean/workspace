import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

  }
}
