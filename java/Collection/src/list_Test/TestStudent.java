package list_Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student("김자바", 150, 60));
    students.add(new Student("이자바", 60, 70));
    students.add(new Student("박자바", 80, 90));

    //1)
    for(Student e : students){
      System.out.println(e);
    }

    //2)
    for(Student e : students){
      if(e.getTotalScore() >= 150){
        System.out.println(e);
      }
    }

    //3)
    for(int i = 0; i < students.size(); i++){
      System.out.println(students.get(i).getTotalScore() / 2.0);
    }


    //총점이 가장 높은 학생의 index
    //4)
    int index = 0;
    for(int i = 1; i < students.size(); i++){
      if(students.get(index).getTotalScore() < students.get(i).getTotalScore()){
        index = i;
      }
    }
    System.out.println(students.get(index));
  }
}
