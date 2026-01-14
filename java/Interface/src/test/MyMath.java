package test;


public class MyMath implements MathUtil{
  public boolean isEven(int a, int b, int c){
    return (a+b+c) % 2 == 0 && (a+b+c) % 5 == 0;
  }

  public double getSumFromOne(int num){
    int sum = 0;
    for(int i = 1; i < num+1 ; i++){
      sum = sum + i;
    }
    return sum;
  }

  public double getCircleArea(int rad){
    return rad < 0 ? 0 : Math.PI * rad * rad;
  }

}
