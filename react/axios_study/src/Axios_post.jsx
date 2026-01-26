
import axios from 'axios';
import React, { useState } from 'react'

const Axios_post = () => {

  //입력한 데이터를 저장할 state 변수
  const [empData, setEmpData] = useState({
    empNum : '',
    empName : '',
    department : '',
    salary : '',
    rank : ''
  });

  //데이터 입력 함수
  const handleEmpData = (e) => {
    setEmpData({
      ...empData,
      [e.target.name] : e.target.value
    })
  }

  //데이터 등록 버튼 클릭 시 spring으로 요청을 보내는 함수
  //post 함수의 두번째 매개변수는 spring으로 전달할 데이터다.
  //전달할 데이터는 객체 형태로 보내야 함
  const regEmp = () =>{
    axios.post('http://localhost:8080/emps', empData)
    .then(response => {
      alert('통신 성공');})
    .catch(e => console.log(e));
  }

  console.log(empData);

  return (
    <>
      <h3>입력 데이터 spring으로 전달하기</h3>
      <div>
        사번
        <input type="text" 
        name='empNum'
        value={empData.empNum} 
        onChange={e =>  handleEmpData(e)}/>
      </div>
      <div>
        사원명
        <input type="text" 
        name='empName'
        value={empData.empName} 
        onChange={e =>  handleEmpData(e)}/>
      </div>
      <div>
        부서명
        <input type="text" 
        name='department'
        value={empData.department} 
        onChange={e =>  handleEmpData(e)}/>
      </div>
      <div>
        급여
        <input type="text" 
        name='salary'
        value={empData.salary} 
        onChange={e => handleEmpData(e)}/>
      </div>
      <div>
        직책
        <input type="text" 
        name='rank'
        value={empData.rank} 
        onChange={e => handleEmpData(e)}/>
      </div>
     
      <div>
        <button type='button' onClick={e => {
          regEmp();
        }} >등록</button>
      </div>
    </>
   
  )
}

export default Axios_post