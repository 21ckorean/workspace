package stu;

public class Student {
  private String name;
  private int age;
  private String grade;
  private String tel; // "010-1111-2222"

  public Student(String name, int age, String grade, String tel) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGrade() {
    return grade;
  }

  public String getTel() {
    return tel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", grade='" + grade + '\'' +
            ", tel='" + tel + '\'' +
            '}';
  }
}
