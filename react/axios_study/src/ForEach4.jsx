
import React from 'react'

const ForEach4 = () => {
  const stuList = [
    {
      stuNum : 1,
      name : 'Kim',
      score : 80
    },
    {
      stuNum : 2,
      name : 'Lee',
      score : 90
    },
    {
      stuNum : 3,
      name : 'Park',
      score : 100
    }
  ];

  return (
    <>
      <table border={1}>
        <thead>
          <tr>
            <td>학번</td>
            <td>이름</td>
            <td>점수</td>
          </tr>
        </thead>
        <tbody>
          {            
            stuList.map((e, i)=>{
              return(
                <tr key={i}>    
                  <td >{e.stuNum}</td>
                  <td >{e.name}</td>
                  <td >{e.score}</td>
                </tr>
              )
            }) 
          }
        </tbody>
      </table>
    </>
   


  )
}

export default ForEach4