
import axios from 'axios';
import React, { useState } from 'react'

const Axios_put = () => {

  //입력할 데이터를 저장할 state변수
  const [empData, setEmpData] = useState({
    empNum : '',
    department : '개발부',  // <- option태그에 value가 '개발부' 인것부터 초기값을 가짐
    salary : '',
  });

  const handleEmpData = (e) => {
    setEmpData({
      ...empData,
      [e.target.name] : e.target.value
    })
  }

  const updateEmp = () => {
    axios.put(`http://localhost:8080/emps/${empData.empNum}`, empData) //(URL, 데이터)
    .then(response => alert('성공'))
    .catch(e => console.log(e))

  }

  console.log(empData);

  return (
    <>
    <h3>사원 정보 수정</h3>
    <div>
      사번
      <input 
      type="text" 
      name='empNum'
      value={empData.empNum}
      onChange={e => handleEmpData(e)}
      />
    </div>
    <div>
      수정할 부서
      <select
      name='department'
      value={empData.department} 
      onChange={e => handleEmpData(e)}
      >
        <option value='개발부'>개발부</option>
        <option value='영업부'>영업부</option>
        <option value='인사부'>인사부</option>
      </select>
    </div>
    <div>
      수정할 급여
      <input 
      type="text"
      name='salary'
      value={empData.salary} 
      onChange={e => handleEmpData(e)}/>
    </div>
    <div>
      <button type='button' onClick={e => {
        updateEmp();
      }}>수정</button>
    </div>
    </>
   
  )
}

export default Axios_put