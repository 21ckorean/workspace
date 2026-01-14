package Test7;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    int num2 = sc.nextInt();
    System.out.println("연산자 : ");
    String oper = sc.next();

    switch (oper){
      case "+":
        Add add = new Add();
        add.setValue(num1, num2);
        System.out.println(num1 + "+" + num2 + " = " + add.calcultate());
        break;
      case "-":
        Sub sub = new Sub();
        sub.setValue(num1, num2);
        System.out.println(num1 + "-" + num2 + " = " + sub.calcultate());
        break;
      case "*":
        Mul mul = new Mul();
        mul.setValue(num1, num2);
        System.out.println(num1 + "*" + num2 + " = " + mul.calcultate());
        break;
      case "/":
        Div div = new Div();
        div.setValue(num1, num2);
        System.out.println(num1 + "/" + num2 + " = " + div.calcultate());
        break;
    }

  }
}
