package list_Test3;

import java.util.List;

public class StudyClass {
  private String className;
  private String teacherName;
  private List<Student> stuList;

  public StudyClass(String className, String teacherName, List<Student> stuList){
   this.className = className;
   this.teacherName = teacherName;
   this.stuList = stuList;
  }

  public void setStuList(List<Student> stuList){
    this.stuList = stuList;
  }

  public List<Student> getStuList(){
    return stuList;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  @Override
  public String toString() {
    return "StudyClass{" +
            "className='" + className + '\'' +
            ", teacherName='" + teacherName + '\'' +
            ", stuList=" + stuList +
            '}';
  }

  //해당 반의 모든 학생의 모든 정보를 출력하는 기능
  public void showStudentsInfo(){
    for(Student s : stuList){
      System.out.println(s);
    }
  }

  //해당반의 평균 성적을 리턴하는 기능
  public double getClassAvg(){
    int sum = 0;
    for(int i = 0; i < stuList.size(); i++){
      sum = sum + stuList.get(i).getScore();
    }
    return (double)sum / stuList.size() ;
  }

  //해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
  //배열에서 가장 큰 수를 구하세요
  public Student getBestScoreStudent(){
    Student stu = stuList.get(0); //최고 성적의 학생(0번째 학생이 가장큰 성적을 지닌학생이라고 가정)
    for(Student s : stuList){
      if(stu.getScore() < s.getScore()){
        stu = s;
      }
    }
    return stu;
  }

}
