
import React from 'react'

const ForEach1 = () => {
  //자바스크립트의 다양한 반복 문법
  const arr = [1,3,5,7,9];

  //일반 for문
  for(let i = 0; i < arr.length; i++){
    console.log(arr[i]);
  }

  //for-each문
  for(const e of arr){        // 자바 for(자료형 : 반복돌릴데이터) 자바스크립트 for(자료형 of 반복돌릴데이터)
    console.log(e);
  }

  //forEach 함수 - 반복 실행 후 리턴 데이터가 없음
  //forEach함수의 매개변수에 화살표함수가 들어가는데 그 화살표 함수의 매개변수에 매개변수2개들어옴
  //첫번째 매개변수 : 하나씩 뺀 데이터의 이름
  //두번째 매개변수 : index (0,1,2,3,4,...)
  const a = arr.forEach((e, i) => {   
    console.log(`e = ${e}, i = ${i}`)
    return 5;
  });

  console.log(a);

  //map 함수  - 반복 실행 결과를 리턴
  const b = arr.map((e, i) => {
    console.log(`e = ${e}, i = ${i}`);
    return e;
  });

  console.log(b)

  

  return (
    <div>ForEach1</div>
  )
}

export default ForEach1