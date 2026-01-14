public class Exception2 {
  public static void main(String[] args) {

    try{
      int[] arr = {1, 2, 3};
      System.out.println(arr[3] );
    }catch(Exception e){
      System.out.println("예외 발생!");
      e.printStackTrace();
    }
    System.out.println("프로그램 종료");

  }
}
