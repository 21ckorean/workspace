import java.util.Arrays;

public class Text2_7 {
  public static void main(String[] args) {

    int[] arr = new int[10];

    //
    for(int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random() * 100 +1);
    }

    //모든 배열 요소를 출력
    System.out.println(Arrays.toString(arr));

    //최대, 최소값을 저장할 변수
    int max = arr[0];  //0번째 요소의 값이 가장 크다고 가정
    int min = arr[0];  //0번째 요소의 값이 가장 작다고 가정


    for(int i = 1; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
      if(min > arr[i]){
        min = arr[i];

      }
    }
    System.out.println(max);
    System.out.println(min);
  }



}
