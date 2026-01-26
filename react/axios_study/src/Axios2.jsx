
import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios2 = () => {
  //SPRING의 응답으로 가져온 사원 정보 중 사원의 이름과 사원의 급여를
  //화면에 출력하세요.

  //spring에서 리턴받은 데이터를 저장하기 위해 state 변수의 초기갑은
  //최종 데이터 자료형을 따라간다.
  const [data, setData] = useState(null);



  //마운트 시에만 실행
  useEffect(() => {
    axios.get('http://localhost:8080/emps/1')
    .then((response) => {
    console.log(response.data);
    setData(response.data);
  })
  .catch((error) => {});
  }, []);

  return ( 
   <div>
    Axios2 <br />
    {data && data.empName}
   </div>
  )
}

export default Axios2

//변수의 사용 영역



