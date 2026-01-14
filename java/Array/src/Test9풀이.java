public class Test9풀이 {
  public static void main(String[] args) {

    int[] arr = {1, 5, 7};

    int sum = 0;
    //배열의 모든 요소의 합
    for(int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }
    System.out.println(sum);
  }
}
