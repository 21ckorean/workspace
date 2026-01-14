public class TestWhile3 {
  public static void main(String[] args) {
    int i = 2;

    while(i <11){
      System.out.print(i+" ");
      i +=2;
    }
    System.out.println();
    System.out.println();
    /// /////////////////////////////////////////////
    int j = 2;

    while(j < 11){
      if(j % 2 == 0){
        System.out.println(j);
      }
      j++;
    }
  }
}
