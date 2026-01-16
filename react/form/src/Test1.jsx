
import React, { useState } from 'react'

const Test1 = () => {
  const [data, setData] = useState({
    name : '',
    age : '',
    year : '1학년',
    gender : '',
    intro : ''
  });

  const handleData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    });
  }

  console.log(data);
  

  return (
    <div>
      <div>
        이름
        <input 
        type ="text"
        name ='name' 
        value={data.name}
        onChange={e => handleData(e)}
        />
      </div>
      <div>
        나이
        <input 
        type="text"
        name ='age' 
        value={data.age}
        onChange={e => handleData(e)}
        />
      </div>
      <div>
        학년
        <select 
        name ='year' 
        value={data.year}
        onChange={e => handleData(e)}
        >
          <option value='1학년'>1학년</option>
          <option value='2학년'>2학년</option>
          <option value='3학년'>3학년</option>
        </select>
      </div>
      <div>
        성별
        <input 
        type="radio" 
        name='gender'
        value={'M'} 
        onChange={e => handleData(e)}
        checked={data.gender === 'M'}
        /> 남
        <input 
        type="radio"
        name='gender'
        value={'F'}
        onChange={e => handleData(e)}
        checked={data.gender === 'F'}
        /> 여
      </div>
      <div>
        소개말
        <textarea 
        cols={50} 
        rows={5}
        name ='intro' 
        value={data.intro}
        onChange={e => handleData(e)}
        ></textarea>
      </div>



    </div>


    
  )
}

export default Test1