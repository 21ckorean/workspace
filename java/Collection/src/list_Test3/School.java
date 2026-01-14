package list_Test3;

import java.util.ArrayList;
import java.util.List;

public class School {
  private List<StudyClass> classList;



  public School(List<StudyClass> classList) {
    this.classList = classList;
  }

  public List<StudyClass> getClassList() {
    return classList;
  }

  public void setClassList(List<StudyClass> classList) {
    this.classList = classList;
  }

  //1) 매개변수로 담당교사명을 받아, 해당 담당교사가 맡고 있는 모든 반의 학생 정보를 출력
  public void showAllInfo(String teacherName){
    for(int i = 0; i < classList.size(); i++){
      if(classList.get(i).getTeacherName().equals(teacherName)){
        classList.get(i).showStudentsInfo();
      }
    }
  }

  //2) 각 반별로 반별 평균 점수 및 전체 학급에 대한 평균 점수를 출력
  public void showAvg(){
    double sum = 0;
    for(StudyClass cls : classList){
      double classAvg = cls.getClassAvg();
      System.out.println(classAvg);
      sum = sum + classAvg;
    }
    System.out.println("학교 평균  : " + (sum / classList.size()));
  }

  //3) 모든 반에서 최고 성적을 가진 학생의 이름과 점수를 출력
  public void showBestStudent(){
    List<Student> students = new ArrayList<>();

    //각 반별 최고 점수 학생
    for(int i = 0; i < classList.size(); i++){
     Student s = classList.get(i).getBestScoreStudent();
     students.add(s);
    }

    Student stu = students.get(0);
    for(Student s : students){
      if(stu.getScore() < s.getScore()){
        stu = s;
      }
    }
    System.out.println(stu);
  }


}
