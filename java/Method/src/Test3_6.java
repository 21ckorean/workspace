import java.util.Arrays;

public class Test3_6 {
  public static void main(String[] args) {
//    int[] a = {1,5,7,3};
//    int result = test3_6(a);
//    System.out.println(result);

    int[] a = {1,2,3,4,5};
    int[] result = test3_9(a);
    System.out.println(Arrays.toString(result));
  }

  // 정수형 배열 하나를매개변수로 받아 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를
  // 만들어보세요
  public static int[] test3_9(int[] arr){ //arr = [1,2,3,4,5] => [2, 4]
    //배열 크기는 변경 불가!! 한번 배열이만들어지면 그 공간을 늘리거나 줄일수 없음.
    //1. 매개변수로 들어온 배열 요소에서 짝수의 갯수를 구함
    int cnt = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
        cnt++;
      }
    }
    //답이 들어갈 배열의 인덱스 번호
    int index = 0;

    //2. 답을 저장할 배열을 생성
    int[] resultArr = new int[cnt];
    //매개변수로 전달된 배열 요소 중 짝수면 결과 배열에 저장
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 == 0){
//        resultArr[index] = arr[i];
//        index++; ※ resultArr[++index] = arr[i]; 는 안됨. 증감연산자에서
//        ++앞에있으면 이거부터하고 다른거계산이라 뒤에들어가야됨.
        resultArr[index++] = arr[i];

      }
    }
    return resultArr;
  }



  //정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드
  public static int test3_6(int[] arr){ //arr = [1,5,7,3]
    int max = arr[0];

    for(int i = 1; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
