public class Test13풀이 {
  public static void main(String[] args) {
    //1부터 누적해서 합을 구하다 300이 최초로 넘었을 때 for문을 멈추고
    //그때까지의 합과 마지막으로 더해진 값을 각각 출력하여라.

    int sum = 0;
    int i = 1;
    for(i = 1; sum <= 300; i++){
      sum += i;
    }

    System.out.println(sum);
    System.out.println(i-1);
  }
}
