package practice;

public class B extends A{
  private int x;
  private int y;

  public B(){
    //부모한테 본인이 가진 x,y값 초기화하라는 명령
    // -> 부모가 가진 변수를 초기화 -> 생성자
    x = 1;
    y = 1;
  }

  public B(int x){
    super(x);
    this.x = 1;
    y = 1;
  }

  public B(int x, int y){
    super(x, y);
    this.x = 1;
    this.y = 1;
  }

  public B(int x, int y, int z){
    super(x, y);
    this.x = z;
    this.y = 1;
  }

  public B(int x, int y, int z, int a){
    super(x, y);
    this.x = z;
    this.y = a;
  }

  public void disp(){
    super.disp();
    System.out.println(", x = " + x + ", y = " + y);
  }



}
