
import React, { useState } from 'react'

const Test7t = () => {
  //TRUTHY -> true는 아닌데 true와 같은 결과로 판단
  //FALSY -> false는 아닌데 false처럼 판단
  //truthy
  // 1. 0이 아닌 숫자
  // 2. 빈 문자열이 아닌 문자열

  //falsy
  // 1. 0
  // 2. 빈 문자열
  // 3. null
  // 4. undefind
  // 5. NaN  (Not a Number)  console.log('java' * 10)


  //단락평가 : 논리연산에서 사용(&&, ||)
  console.log(true); //true
  console.log(true && 10); //10 왜 why?
  console.log(true || 10); //true
  console.log('' && 'java'); // ''
  console.log(10 && 100 ); // 100


  //div 보여줌 여부를 결정하는 변수
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div 
        style={{
          width:'300px', 
          height:'60px', 
          backgroundColor:'pink',
          color:'white', 
          textAlign: 'center',
          lineHeight: '60px',
          marginBottom: '10px'
        }} 
        onMouseEnter={() => {setIsShow(true);}} 
        onMouseLeave={() => {setIsShow(false);}}
      >
        마우스를 올리면 숨겨진 글자가 보여요
      </div>
      {/* 단락평가(자바스크립트 문법) */}
      {
        isShow &&
        <div style={{
        width : '300px',
        height : '60px',
        border : '1px solid black'
        }}>
        Hello React!
        </div>
      }

      
      {/* 삼항연산자  */}
      {/* {
        isShow 
        ? 
        <div style={{
        width : '300px',
        height : '60px',
        border : '1px solid black'
        }}>
        Hello React!
        </div>
        :
        null
      } */}
    </>
  )
}

export default Test7t