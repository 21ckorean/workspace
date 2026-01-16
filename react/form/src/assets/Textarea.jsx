
import React, { useState } from 'react'

const Textarea = () => {
  //textarea에 입력한 데이터를 저장할 state 변수
  const [data, setData] = useState('');

  console.log(data);

  return (
    <div>
      <textarea 
      //자동완성시{} -> 자바스크립트코드넣으세요 ' ' -> html코드,값고정
      //자바스크립트를 쓴다는건 값바뀔때 씀
      cols='50' 
      rows='5' 
      value={data}
      onChange={e => {
        setData(e.target.value);
      }}
      >
      </textarea>
    </div>
  )
}

export default Textarea