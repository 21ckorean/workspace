package list_Test3;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
  public static void main(String[] args) {

    //학생을 9명 생성
    Student s1 = new Student("김자바", 20, 80);
    Student s2 = new Student("이자바", 25, 81);
    Student s3 = new Student("박자바", 30, 82);
    Student s4 = new Student("정자바", 35, 83);
    Student s5 = new Student("최자바", 40, 84);
    Student s6 = new Student("윤자바", 45, 85);
    Student s7 = new Student("홍자바", 50, 86);
    Student s8 = new Student("황자바", 55, 87);
    Student s9 = new Student("강자바", 60, 88);

    //학급별 저장되어야 하는 학생 목록 생성
    List<Student> stulist1 = new ArrayList<>();
    stulist1.add(s1);
    stulist1.add(s2);
    stulist1.add(s3);

    List<Student> stulist2 = new ArrayList<>();
    stulist2.add(s4);
    stulist2.add(s5);
    stulist2.add(s6);

    List<Student> stulist3 = new ArrayList<>();
    stulist3.add(s7);
    stulist3.add(s8);
    stulist3.add(s9);

    //학급 3개 생성
    StudyClass cls1 = new StudyClass("자바반", "김강사", stulist1);
    StudyClass cls2 = new StudyClass("영상반", "이강사", stulist2);
    StudyClass cls3 = new StudyClass("디자인반", "김강사", stulist3);

    List<StudyClass> clsList = new ArrayList<>();
    clsList.add(cls1);
    clsList.add(cls2);
    clsList.add(cls3);


    //학교
    School school = new School(clsList);

    //문제1
    int age = school.getClassList().get(1).getStuList().get(1).getAge();

    //문제2
    String a = school.getClassList().get(2).getTeacherName();

    //school.showAllInfo("김강사");

    //school.showAvg();

    school.showBestStudent();
  }
}
