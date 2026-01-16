
import React, { useState } from 'react'

const Student = () => {
  const [name, setName] = useState('');
  const [korScore, setKorScore] = useState('');
  const [engScore, setEngScore] = useState('');

  console.log(name, korScore, engScore);

  return (
    <>
      이름
      <input 
      type="text" 
      value={name}
      onChange={(e) => {
        setName(e.target.value);
      }}
      />
      <br />

      국어점수
      <input 
      type="text" 
      value={korScore}
      onChange={(e) => {
        setKorScore(e.target.value);
      }}
      />
      <br />

      영어점수
      <input 
      type="text" 
      value={engScore}
      onChange={(e) => {
        setEngScore(e.target.value);
      }}
      />
      <br />
      <br />

      <div>입력한 학생 정보입니다
        <div>이름 : {name}</div>
        <div>국어점수 : {korScore}</div>
        <div>영어점수 : {engScore}</div>
        <div>총점 : {korScore + engScore}</div>
      </div>
    </>
   
  )
}

export default Student