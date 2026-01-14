//기본 함수 선언 문법
function hello(){
  console.log('hello');
}

//함수 표현식 사용
const hello2 = function (){
  console.log('hello');
}

//화살표 함수
const hello3 = () => {
  console.log('hello')
}

function intro1(){
  console.log('반가워');
  console.log('또 만나');
}

const intro2 = function(){
  console.log('반가워')
  console.log('또 만나')
}

const intro3 = () => {
  console.log('반가워')
  console.log('또 만나')
}

function printNum1(num){
  console.log(num);
}

const printNum2 = function(num){
  console.log(num);
}

//화살표함수
//만약 매개변수가 하나라면 소괄호 생략 가능
//만약 함수 안의 실행내용이 한 줄이라면 중괄호 생략 가능
//만약 실행 내용이 한 줄이고 + 그 한줄이 return문이라면
//중괄호 생략과 함께 return 키워드도 생략해야 함!
const printNum3 = num => console.log(num);

//기본함수
function printSum1(num1, num2){
  console.log(num1 + num2);
}

//함수표현식
const printSum2 = function(num1, num2){
  console.log(num1 + num2);
}

//화살표 함수
const printSum3 = (num1, num2) => console.log(num1 + num2);
printSum3(1, 2);

//기본함수
function getDouble(num){
  return num * 2;
}

//함수표현식
const getDouble2 = function(num){
  return num * 2;
}

//화살표 함수
const getDouble3 = num => num * 2;
getDouble3(2);








