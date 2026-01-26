
import axios from 'axios';
import React, { useEffect, useState } from 'react'

const ForEach5 = () => {

  //조회한 사원 정보를 저장할 state 변수
  //조회한 데이터를 담을 변수의 초기값은 최종적으로 저장될 데이터의 형태와 일치시키면 됨
  const [empList, setEmpList] = useState([]);

  console.log(empList)


  //마운트 시점에 사원목록을 조회한다
  useEffect(() => {
    axios.get('http://localhost:8080/emps')
    .then(response => {
    // console.log(response.data);
    setEmpList(response.data);
  })
  .catch(e => console.log(e))}, [])

  return (
    
    <div>
      <table border={1}>
        <thead>
          <tr>
            <td>사번</td>
            <td>이름</td>
            <td>부서</td>
            <td>급여</td>
            <td>직책</td>
          </tr>
        </thead>
        <tbody>
          {
            empList.map((e, i) => {
              return(
                <tr key={i}>
                  <td>{e.empNum}</td>
                  <td>{e.empName}</td>
                  <td>{e.department}</td>
                  <td>{e.salary}</td>
                  <td>{e.rank}</td>
                </tr>
              )
            })
          }   
        </tbody>
      </table>
    </div>


  )
}

export default ForEach5