
import axios from 'axios';
import React, { useState } from 'react'

const Axios4 = () => {
  //select태그에서 선택한 사번을 저장할 변수

  const [empNo, setEmpNo] = useState('0');
  const [empInfo, setEmpInfo] = useState({}); 

  console.log();

  const getEmpInfo = a => {
    axios.get(`http://localhost:8080/emps/${a}`)
    .then(response => {
      console.log(response);
      setEmpInfo(response.data);
    })
    .catch(e => {
      console.log(e);
    });
  }

  return (
    <>
      <h3>조회할 사번 선택</h3>
      <select 
      value={empNo}
      onChange={e => {
        setEmpNo(e.target.value);
        getEmpInfo(e.target.value);
      }}
      >
        <option value='0'>사번선택</option>
        <option value='1'>1</option>
        <option value='2'>2</option>
        <option value='3'>3</option>
        <option value='4'>4</option>
        <option value='5'>5</option>
     
  
      </select>

      <div>
        <p>조회한 사원 정보입니다</p>
        <p>사번 : {empInfo.empNum}</p>
        <p>사원명 : {empInfo.empName}</p>
        <p>직급 : {empInfo.rank}</p>
        <p>급여 : {empInfo.salary}</p>
        <p>부서명 : {empInfo.department}</p>
      </div>
    </>
   


  )
}

export default Axios4