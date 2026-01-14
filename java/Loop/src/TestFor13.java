public class TestFor13 {
  public static void main(String[] args) {

    int sum = 0;
    int i = 0;
    for(i = 1; sum < 301; i++){
      sum = sum + i;
    }

    System.out.print("그때 까지의 합");
    System.out.println(sum);

    System.out.print("마지막으로 더해진 값");
    System.out.println(i-1);
  }
}
