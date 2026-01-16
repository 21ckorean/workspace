
import React, { useState } from 'react'

const Test2 = () => {

  const [data, setData] = useState({
    chicken : 'a',
    cnt : '',
    date : '',
    intro : ''
  });
 
  const handleSetData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value});    
  }

  console.log(data);

  return (
    <div>
      <div>
        <h2>치킨!!!</h2>
        <h3>치킨 종류와 상관없이 무조건 만원!</h3>
        <input 
        type="radio"
        name='chicken'
        value={'a'}
        checked={data.chicken === 'a'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨

        <input 
        type="radio"
        name='chicken'
        value={'b'}
        checked={data.chicken === 'b'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨2

        <input 
        type="radio"
        name='chicken'
        value={'c'}
        checked={data.chicken === 'c'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨3
        <input 
        type="radio"
        name='chicken'
        value={'d'}
        checked={data.chicken === 'd'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨4
        <input 
        type="radio"
        name='chicken'
        value={'e'}
        checked={data.chicken === 'e'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨5
        <input 
        type="radio"
        name='chicken'
        value={'f'}
        checked={data.chicken === 'f'}
        onChange={e => handleSetData(e)}
        /> 후라이드치킨6

      </div>

      <div>
        몇마리
        <input 
        type="number" 
        name='cnt'
        value={data.cnt}
        onChange={e => handleSetData(e)}
        />
      </div>

      <div>
        주문일
        <input 
        type="date" 
        name='date'
        value={data.date}
        onChange={e => handleSetData(e)}
        />
      </div>

      <div>
        요청사항
        <textarea 
        cols='40'
        rows='5'
        name='intro'        
        value={data.intro}
        onChange={e => handleSetData(e)}
        ></textarea>
      </div>
    </div>
  )
}

export default Test2