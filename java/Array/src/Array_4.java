import java.util.Arrays;

public class Array_4 {
  public static void main(String[] args) {

    //배열이 자료형 이라는 의미
    int[] a1 = {1,2,3};
    // String[] a2 = a1; a1과 a2는 자료형이다르다!! 그래서실행안됨.
    // int d = a1; 안됨.
    int[] a3 = a1;

    int a = 5;
    int b = a;


    int[] arr1 = {1,3,5};
    int[] arr2 = {4,5};
    arr2 = arr1;
    arr2[0] = 6;  // 6 3 5
    arr1[1] = 7;  // 6 7 5
    System.out.println(Arrays.toString(arr1)); // 6 7 5
    System.out.println(Arrays.toString(arr2)); // 6 7 5


  }
}
