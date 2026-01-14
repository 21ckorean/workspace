public class Test11 {
  public static void main(String[] args) {

    int sum = 0;
    int[] arr ={1, 2, 3, 4, 5, 6, 7, 8};

    for(int i = 0; i<arr.length; i++){
      if((arr[i]+3)%2==0){
      sum += 1;
      }
    }
    System.out.print("배열의 개수 중 짝수의 개수 : " + sum);
  }
}

