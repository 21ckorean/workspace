package stu;

import java.util.Scanner;

public class StudentService {
  //학생 3명이 저장될 공간
  private Student[] students = new Student[3];
  private Scanner sc;
  private int stuCnt; //등록된 학생수


  public StudentService(){
    students = new Student[3];
    sc = new Scanner(System.in);
    stuCnt = 0;
  }

  //학생등록 메서드
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("나이 : ");
    int age = sc.nextInt();
    System.out.print("연락처 : ");
    String tel = sc.next();
    System.out.print("학점 : ");
    String grade = sc.next();

    //입력받은 정보를 가진 학생 객체를 생성
    Student s = new Student(name, age, grade, tel);

    //생성한 객체를 배열에 저장
    students[stuCnt++] = s;
    //students[stuCnt] = s;
    //stuCnt++;

  }
  //학생정보변경(연락처) 메서드
  public void changeStuTel(){
    System.out.println("학생의 연락처를 변경합니다");
    System.out.print("변경 학생 : ");
    String name = sc.next();


    int matchedIndex = -1;
    for(int i = 0; i < stuCnt ; i++){
      if(students[i].getName().equals(name)){
        matchedIndex = i;
        break;
      }
    }
    if(matchedIndex == -1){
      System.out.println("일치하는 학생이 없어요");
    }
    else{
      System.out.print("연락처 : ");
      String tel = sc.next();
      students[matchedIndex].setTel(tel);
      System.out.println("변경완료되었습니다.");
    }

  }

  //학생정보출력 메서드
  public void printStuInfo(){
    System.out.print("정보를 열람할 학생 : ");

    //찾아야하는 학생의 이름
    String name = sc.next();

    //students 배열에서 입력한 학생 이름 찾기
    int matchedIndex = -1; //이름이 일치하는 학생의 index
    for(int i = 0; i < stuCnt ; i++){
      if(students[i].getName().equals(name)){
        matchedIndex = i;
        break;
      }
    }

    if(matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다");
    }
    else{
      System.out.println("요청하는 학생의 정보입니다.");
      System.out.println(students[matchedIndex]);
    }

  }

  //모든학생 정보출력 메서드
  public void printStuInfoAll(){
    System.out.println("모든학생의 정보입니다. 현재 총 학생 수는" + stuCnt + "명입니다.");

    //등록된 학생 수 만큼 반복해서 정보 출력
    //학생은 students 배열에 저장되어있음
    for(int i = 0; i < stuCnt; i++){
      System.out.println(students[i]);
    }

  }
}
