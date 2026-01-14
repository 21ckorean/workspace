public class Test2_6풀이 {
  public static void main(String[] args) {
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};

    //작성위치( max변수에 배열의 요소 중 가장 큰 수를 저장하는 코드)
    for(int i = 0; i < array.length; i++){
      if(max < array[i]){
        max = array[i];
      }
    }

    System.out.println("max : " + max);
  }
}
