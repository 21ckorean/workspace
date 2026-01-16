
import React, { useState } from 'react'

const Input4 = () => {
  //Input 태그에 입력받은 정보를 저장할 state 변수
  const [stuInfo, setStuInfo] = useState({
    name : '',
    korScore : 0,
    engScore : 0
  });

  //입력정보 저장 함수
  const handleStuInfo = (e) => {
    setStuInfo({
      ...stuInfo,
      [e.target.name] : e.target.value
    })
  };

  console.log(stuInfo);

  return (
    <>
      <div>
        이름
        <input 
        type="text" 
        name='name'
        value={stuInfo.name} //value에 입력한값이랑 input태그에 값이랑 같음
        onChange={e => {
          handleStuInfo(e);
        }}
        
        />
      </div>

      <div>
        국어점수
        <input 
        type="text" 
        name='korScore'
        value={stuInfo.korScore}
        onChange={e => {
          handleStuInfo(e);

          //국어점수 input태그에 입력한 데이터를 stuInfo의 korScore키에 저장!
          //setStuInfo() 소괄호안에 변경할값 작성
          //소괄호안에 80을넣어버리면 stuInfo = 80;이 되버리기때문에
          //소괄호안에 객체를 넣어서 원래 데이터 처럼 가져와야함.
          // setStuInfo({
          //   ...stuInfo,
          //   korScore : e.target.value
          // });
        }}
        />
      </div>

      <div>
        영어점수
        <input 
        type="text" 
        name='engScore'
        value={stuInfo.engScore}
        onChange={e => {
          handleStuInfo(e);
        }}
        />
      </div>
    
      <hr />

      <div>
        <p>입력한 학생 정보입니다</p>
        <p>이름 : {stuInfo.name}</p>
        <p>국어점수 : {stuInfo.korScore}</p>
        <p>영어점수 : {stuInfo.engScore}</p>
        <p>총점 : {Number(stuInfo.korScore) + Number(stuInfo.engScore)}</p>
        {/* <p>총점 : {stuInfo.korScore} + {stuInfo.engScore}</p> => 이렇게 쓰면X, 0 + 0 이나옴*/ }
        {/* input태그에 작성된것은 문자열로 취급 */}
      </div>
    </>
  )
}

export default Input4