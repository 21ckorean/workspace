package test;

public class Myarray implements ArrayUtil{

  @Override
  public int getArraySum(int[] arr1, int[] arr2) {
    //매개변수로 전달된 두 정수형 배열의 모든 요소의 평균을 리턴
    int sum1 = 0; // arr1 배열의 모든 요소의 합
    int sum2 = 0; // arr2 배열의 모든 요소의 합
    for(int i = 0; i < arr1.length; i++){
      sum1 = sum1 + i;
    }
    for(int i = 0; i < arr2.length; i++){
      sum2 = sum2 + i;
    }

//    for(int e : arr1){ //arr1 = [1, 3, 5]
//      sum1 = sum1 +e;
//    }
//    for(int e : arr2){
//      sum2 = sum2 +e;
//    }

    return (sum1 + sum2) / (arr1.length + arr2.length);
  }

  //매개변수로 전달된 배열의 모든 요소가 짝수 일때는 리턴 true, 아닐 때는 false 리턴
  @Override
  public boolean isEvenArray(int[] arr) {
    boolean isAllEven = true;

    //배열의 요소 중 하나라도 홀수를 만나면 isAllEven 변수의 값을 false로 변경

    for(int i = 0; i < arr.length; i++){
      if( arr[i] % 2 != 0){
        isAllEven = false;
        break;
      }
    }
    return isAllEven;
  }
  //매개변수로 전달된 문자열 배열 각 요소의 글자수를 배열로 리턴
  //ex> 매개변수 ["aa", "aaa", "aaaa"] -> 결과 : [2,3,4]
  @Override
  public int[] getStrLengthArray(String[] arr) {
    int[] resultArr = new int[arr.length];

    for(int i = 0; i < resultArr.length; i++){
      resultArr[i] = arr[i].length();
    }

    return resultArr;
  }
}
