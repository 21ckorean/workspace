public class Test2_3풀이 {
  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    int[] newArr = {arr1.length + arr2.length};

    //newArr 배열에 arr1배열의 모든 요소를 저장
    for(int i = 0; i < arr1.length; i++){
      newArr[i] = arr1[i];
    }

    //newArr 배열에 arr2배열의 모든 요소를 저장
    for(int i = 0; i < arr2.length; i++){
      newArr[i + arr1.length] = arr2[i];
    }

    //결과출력
    for(int i = 0; i < arr1.length + arr2.length; i++){
      System.out.print(newArr[i]);
    }
  }
}
