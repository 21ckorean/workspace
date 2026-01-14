public class Test2_4 {
  public static void main(String[] args) {

    int sum = 0;
    int i = 1;
    for(i = 1; i>=1; i++){
      sum = sum + i;
      if(sum > 50){
        break;
      }
    }
    System.out.println(sum);
    System.out.println(i);
  }
}
