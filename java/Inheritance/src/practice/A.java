package practice;

public class A {
  private int x;
  private int y;

  public A(){
    x = 1;
    y = 1;

  }

  public A(int x){
    this.x = x;
    y = 1;
  }

  public A(int x, int y){
    this.x = x;
    this.y = y;
  }




  public void disp(){
    System.out.print("x = " + x + ", y = " + y);

  }
}
