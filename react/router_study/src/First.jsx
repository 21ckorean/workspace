
import React from 'react'
import { useParams } from 'react-router-dom'

const First = () => {

  //URL Parameter로 전달되는 데이터 받기 //path="/first/:age"
  // const params = useParams(); //실행하면 데이터가 객체로 나온다.
  // console.log(params);
  const {age} = useParams(); 

  return (


    <>
      <h3>First 컴포넌트입니다</h3>
      <p>/first url을 입력하면 컴포먼트가 보입니다.</p>
      <p>{age}</p>
    </>
   
  )
}

export default First