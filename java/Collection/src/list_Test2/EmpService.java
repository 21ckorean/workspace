package list_Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  private List<Emp> empList;
  private Scanner sc;


  public EmpService(){
    sc = new Scanner(System.in);

    empList = new ArrayList<>();
    //사번 중복X
    empList.add(new Emp(1001, "김자바", "개발부", "010-1111-1111", 1000));
    empList.add(new Emp(1002, "이자바", "개발부", "010-1111-2222", 2000));
    empList.add(new Emp(1003, "박자바", "개발부", "010-1111-3333", 3000));
    empList.add(new Emp(1004, "최자바", "인사부", "010-1111-4444", 4000));
    empList.add(new Emp(1005, "강자바", "인사부", "010-1111-5555", 5000));
    empList.add(new Emp(1006, "윤자바", "인사부", "010-1111-6666", 6000));

  }

  public void login(){
    boolean isRunning = true; //반복 여부를 결정하는 변수
    while(isRunning){
      System.out.println("사번 : ");
      int empNo = sc.nextInt();
      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String pw = sc.next();

      //정보가 일치하는 회원 찾기
      boolean isNotFound = true;
      for(Emp e : empList){
        if(e.getEmpNo() == empNo && e.getPw().equals(pw)){
          System.out.println("로그인 성공");
          System.out.println("'" + e.getEmpName()+ "'" + "님 반갑습니다." );

          //true -> false
          isRunning = false;
          isNotFound = false;
          break;
        }
      }
      //일치하는 사원이 없으면 출력
      if(isNotFound){
        System.out.println("사번 혹은 비번이 잘못되었습니다.");
      }


    }
  }

  //2
  public void showSalaryInfoPerDept(){
    System.out.print("부서명 : ");
    String deptName = sc.next();

    System.out.println("===" + deptName + " 월급 현황===");

    int sum = 0;
    int cnt = 0;
    for(Emp e : empList){
      if(e.getDeptName().equals(deptName)){
        e.showInfo();
        sum = sum + e.getSalary();
        cnt++;
      }
    }
    System.out.println(deptName + "서의 월급 총액은 " + sum + "이며, 평균 급여는 " + (sum / (double)cnt) + "원입니다.");


  }

  //3
  public void increaseSalary(){
    System.out.print("부서명 : ");
    String deptName = sc.next();
    System.out.println("인상급여 : ");
    int salary = sc.nextInt();

    System.out.println(deptName + "각 사원의 급여가 각각 " + salary + "원씩 인상됩니다.");

    for(int i = 0; i < empList.size(); i++){
      if(empList.get(i).getDeptName().equals(deptName)){
        empList.get(i).setSalary(empList.get(i).getSalary() + salary);
      }
    }

    System.out.println("===월급 인상 후 " + deptName + " 월급 현황===");
    for(int i = 0; i < empList.size(); i++){
      if(empList.get(i).getDeptName().equals(deptName)){
        empList.get(i).showInfo();
      }
    }
  }







}
