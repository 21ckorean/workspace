
//이름, 나이, 점수를 갖는 학생 객체를 생성
//key와 value로 이루어진 다수의 데이터를 저장하는 변수
const student = {
  name : 'Kim', 
  age : 20, 
  score : 90
};

//객체 정보 출력 문법
console.log(student.name); //kim
console.log(student); //

//객체 데이터 변경 및 추가
student.age = 30; //존재하는 키에 접근하면 데이터 수정
student.addr = '울산'; //존재하지 않는 키에 접근하면 데이터 추가
console.log(student);


////////////////////////////////////////////////////////////

const arr = [
  1, 
  5.5, 
  'abc', 
  [6, 7, 8], 
  {name: 'kim', age : 20}
];

console.log(arr[1]); //5.5
console.log(arr[3][2]); //8
console.log(arr[4].name); //"kim"

///////////////////////////////////////////////////////////////
//List<Student> list new ArrayList<>();

const studentList = [
  {stuNum : 1, name : 'kim', score : 80}, 
  {stuNum : 2, name : 'lee', score : 90}, 
  {stuNum : 3, name : 'park', score : 100}
];

console.log(studentList);
console.log(studentList[1].name);

//studentList에 저장된 모든 학생의 점수 총합을 출력
//for
let sum = 0;
for(let i = 0; i < studentList.length; i++){
  sum = sum + studentList[i].score;
}
console.log(sum);

//학번이 짝수인 학생의 이름을 출력
//for-each
for(let e of studentList){  //let을 써도되고 const 써도 됨.
  if(e.stuNum % 2 == 0){
    console.log(e.name);
  }
}

// studentList.filter(e => e.stuNum % 2 == 0)
//            .forEach(e => console.log(e.name));
