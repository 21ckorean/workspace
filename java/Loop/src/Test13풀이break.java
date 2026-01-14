public class Test13풀이break {
  public static void main(String[] args) {

    int i = 1;
    int sum = 0;
    while(true){
      sum = sum +i;
      //sum이 300을 넘기면 멈추세요!
      if(sum > 300){
        break;
      }
      i++;
    }
    System.out.println(sum);
    System.out.println(i);
  }
}

