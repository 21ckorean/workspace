package test;

import java.util.Scanner;

public class MyStudent implements StudentUtil{
  Scanner sc = new Scanner();

  //매개변수로 들어온 학생의 총점을 리턴
  //메서드명 : getTotalScore
  @Override
  public int getTotalScore(Student student) {

    return student.getKorScore()+ student.getMathScore()+ student.getEngScore();
  }

  //매개변수로 들어온 두 학생 중
  //총점이 높은 학생을 리턴
  @Override
  public Student getHighScoreStudent(Student stu1, Student stu2) {

    //return stu1.getKorScore()+ stu1.getMathScore()+ stu1.getEngScore() >
    // stu2.getKorScore()+ stu2.getMathScore()+stu2.getEngScore() ? stu1 : stu2;
    return getTotalScore(stu1) > getTotalScore(stu2) ? stu1 : stu2;
  }

  //학생 여러명을 매개변수로 받아, 또 다른 매개변수로
  //받은 학생의 이름과 일치하는 학생의 점수 등급을 문자열로 리턴

  //학생의 점수 등급은 총점의 평균으로 계산.
  //만약, 매개변수로 받은 이름과 일치하는 학생이 없다면
  //"학생 정보 없음"이라는 문자열을 리턴

  // 90 <= 총점 <= 100 -> A
  // 80 <= 총점 <= 89 -> B
  // 70 <= 총점 <= 79 -> C
  // 70 > 총점 -> D
  @Override
  public String getGradeByStudentName(Student[] students, String name) {
    String result = "학생 정보 없음";


    //학생수만큼 반복
    for(Student student : students){
      if(student.getName().equals(name)){
        double avg = getTotalScore(student) / 3.0 ;
        result = getGrade(avg);
        break;
      }
    }
    return result;
  }

  @Override
  public int[] getTotalScoresToArray(Student[] students) {
    //학생들의 총점을 저장할 배열 생성
    int[] totalScoreArr = new int[students.length];

    for(int i = 0; i < totalScoreArr.length; i++){
      totalScoreArr[i] = getTotalScore(students[i]);
    }

    return
  }

  //점수에 따른 등급을 리턴하는 메서드
  public String getGrade(double avg){
    String result = null;
    if(avg >= 90 && avg <= 100 ){
      result = "A";
    }
    else if(avg >= 80){
      result = "B";
    }
    else if(avg >= 70){
      result = "C";
    }
    else{
      result = "D";
    }

    return result;
  }

}
