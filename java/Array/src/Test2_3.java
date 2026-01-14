public class Test2_3 {
  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6};
    int[] newArr = new int[6];

    System.out.print("newArr의 요소 : ");
    for(int i = 0; i < arr1.length+arr2.length; i++){
      if(i < arr1.length){
        newArr[i] = arr1[i];
      }
      else {
        newArr[i]= arr2[i-arr1.length];
      }
      System.out.print(newArr[i] + " ");
    }
  }
}
