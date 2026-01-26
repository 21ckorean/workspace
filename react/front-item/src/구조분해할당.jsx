
import React from 'react'

const 구조분해할당 = () => {
  //구조분해할당 : 배열과 객체에서 사용가능. 배열, 객체에 저장된 데이터를 편하게 사용!!!
  // const a = arr1[0];
  // const b = arr1[1];
  // const c = arr1[2];

  const arr1 = [1,3,5];
  const [a1, b1, c1] = arr1; //console.log(a1); 1
  const [a2, b2] = arr1; //a2 =1, b2 = 3
  const [a3, b3, c3, d3] = arr1; //console.log(d3); undefined

  const test1 = ([a, b]) => {
    console.log(a); //1
    console.log(b); //2
  }

  const arr = [1,2,3];
  /////////////////////////////////////////////////////////
  const student = {
    name : 'kim',
    age : 20,
    score : 80
  }

  // 기본
  // const name = student.name;
  // const age = student.age;
  // const score = student.score;
  //객체를 구조분해할당할때는 변수명을 반드시 key값과 동일하게 저장!
  //const {name, age, score} = student;
  //const {age, score, name} = student;
  //const {name, age} = student;
  const {name, score, age, addr} = student; //addr = undefined

  //구조분해할당 미사용 함수
  const test2 = (stu) => { //stu = testObject
    console.log(stu.name);
    console.log(stu.age);
  }

  //구조분해할당 사용 함수
  const test3 = ({name, age}) => { //{name, age} = testObject
    console.log(name);
    console.log(age);
  }

  const testObject = {
    name : '111',
    age : 30
  }

  test2(testObject);
  test3(testObject);
  

  return (
    <div>구조분해할당</div>



  )
}

export default 구조분해할당


