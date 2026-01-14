
import React from 'react'

//jsx에서는 변수를 html로 표현 할 수 있음
const Variable = () => {
  const num = 10;
  const name = 'kim';
  const arr = [1, 2, 'str'];
  const flag = true;
  const data = null;
  //undefined : 정의되지 않음
  //변수는 있지만 초기값이 없을때
  //변수 선언이 되지 않았을 때
  const data2 = undefined;
  //객체는 중괄호, 배열은 대괄호
  //객체 키값 하나하나(객체.키)는 출력이되는데, 객체통으로 출력시키려하면 오류
  //객체 전체를 화면에 출력하면 오류발생!
  const person = {
    name : 'kim',
    age : 20
  };

  return (
    <>
      <div className="">{num}</div>
      <div>{name}</div>
      <div>{arr[1]}</div>
      <div>{arr}</div>
      <div>flag = {flag}</div>
      <div>data = {data}</div>
      <div>data2 = {data2}</div>
      <div> {person.name}</div>
      {/* <div> {person}</div> */}
    </>
  )
}

//export 하지 않으면 다른 파일에서 import 불가
export default Variable