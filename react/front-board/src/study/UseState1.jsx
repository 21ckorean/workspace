import axios from 'axios';
import React, { useState } from 'react'

//state 변경함수 코드가 해석되면
//state 변경함수의 실행은 나머지 코드 실행 완료 후 일괄 실행(동시실행) 됨
//state 변경함수가 여러개 실행되도 1회만 리렌더링 한다.

//state 변경함수 사용법은 두 가지가 존재
//1. setCnt(cnt변수에 저장할 값);
//   ex) setCnt(7); -> cnt값을 7로 변경
//2. 함수형 업데이트 : setCnt((이전 cnt값) => {return cnt변수에 저장할 값});
//   ex) setCnt((prev) => {return 7})
//    -> setCnt(prev => 7)

// const test = (a) => {return a +10};
const test = a => a + 10; //중괄호 없애는대신 return도 없애야함.


const UseState1 = () => {
  const [cnt, setCnt] = useState(0);

  const [cnt2, setCnt2] = useState(0);

  //게시글번호를 저장하는 state 변수
  const [boardNum, setBoardNum] = useState(1);

  //게시글 상세조회 함수
  const getBoardList = () => {
    setBoardNum(5);

    axios.get(`http://localhost:8080/boards/${boardNum}`)
    .then()
    .catch();
  }


  return (
    <div>
      <h3>CNT = {cnt}</h3>
      <h3>CNT2 = {cnt2}</h3>
      <button 
        type='button'
        onClick={e => {
          console.log(cnt); //0
          setCnt(cnt + 1);  //일단보류
          console.log(cnt); //0
          setCnt(cnt + 1);  //일단보류 만약에 cnt +2면 동시실행됬을때 값이 다른데 뭐로정함?
          console.log(cnt); //0
          //이 코드 실행되면 리렌더링 1번만함.
        }}
      >클릭</button>

      <button 
        type='button'
        onClick={e => {
          console.log(cnt2);
          setCnt2(prev => prev + 1);
          console.log(cnt2);
          setCnt2(prev => prev + 1);
          console.log(cnt2);
        }}
      >클릭</button>
    </div>
  )
}

export default UseState1