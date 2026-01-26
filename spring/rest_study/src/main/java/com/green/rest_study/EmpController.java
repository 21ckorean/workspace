package com.green.rest_study;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("emps")
@RestController
public class EmpController {
  //1)
  private List<Emp> emplist;

  //2)
  public EmpController(){
    emplist = new ArrayList<>();

    emplist.add(new Emp(1, "김자바", "인사부", 1000, "사원"));
    emplist.add(new Emp(2, "이자바", "개발부", 2000, "대리"));
    emplist.add(new Emp(3, "박자바", "인사부", 3000, "과장"));
    emplist.add(new Emp(4, "최자바", "개발부", 4000, "차장"));
    emplist.add(new Emp(5, "강자바", "인사부", 5000, "부장"));
  }

  //localhost:8080/emps

  //3) 사원 목록 조회
  @GetMapping("")
  public List<Emp> getEmplist(){
    System.out.println("사원목록조회");
    return emplist;
  }

  //4) 사번을 통해 특정 사원 한명의 정보 조회
  @GetMapping("/{empNum}")
  public Emp getEmp(@PathVariable("empNum") int empNum){

    Emp result = null;
    for(Emp e: emplist){
      if(e.getEmpNum() == empNum){
        result = e;
      }
    }
    return result;
  }
  //5) 사원등록
  @PostMapping("")
  public void regEmp(@RequestBody Emp emp){
    System.out.println("사원 등록 실행");
    System.out.println(emp);
    emplist.add(emp);
  }

  //6) 사번을통해 특정사원 한명을 삭제
  // URL (DELETE) localhost:8080/emps/3
  @DeleteMapping("/{empNum}")
  public List<Emp> deleteEmp(@PathVariable("empNum") int empNum){
    System.out.println("사원 삭제 empNum = " + empNum);
    for(int i = 0; i < emplist.size(); i++){
      if(emplist.get(i).getEmpNum() == empNum){
        emplist.remove(i);
      }
    }
    return emplist;
  }

  //7) 사번을 통해 특정 사원 한명 정보 수정, 사원의 사번과 수정할 급여,부서명 정보가 함께 전달됨.
  // URL (PUT) localhost:8080/emps/3
  @PutMapping("/{empNum}")
  public Emp updateEmp(@PathVariable("empNum") int empNum, @RequestBody Emp emp){

    Emp result = null;
    for(int i = 0; i < emplist.size(); i++){
      if(emplist.get(i).getEmpNum() == empNum){
        emplist.get(i).setSalary(emp.getSalary());
        emplist.get(i).setDepartment(emp.getDepartment());
        result = emplist.get(i);
      }
    }
    System.out.println(result);
    System.out.println("empNum = " + empNum);
    System.out.println(emp);
    return result;
  }



}
