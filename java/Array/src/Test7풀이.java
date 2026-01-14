public class Test7풀이 {
  public static void main(String[] args) {

    int[] arr = new int[10];

    //배열의 모든 요소에 3을 저장
    for(int i = 0; i<arr.length; i++){
      arr[i] = 3;
    }

    //배열의 모든 요소에 3이 저장되었는지 출력
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
