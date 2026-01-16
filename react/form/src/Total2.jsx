
import React, { use, useState } from 'react'
import './Total2.css'

const Total2 = () => {

  const [chicken, setChicken] = useState('a');
  const [cnt, setCnt] = useState('');
  const [date, setDate] = useState('');
  const [text, setText] = useState('');

  return (
    <div className='chicken_container'>
      <h2>치킨!!!</h2>
      <h3>치킨 종류와 상관 없이 무조건 만원!</h3>
      <input 
      type="radio" 
      name='chicken'
      value={'a'}
      checked={chicken === 'a'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />후라이드치킨
      <input 
      type="radio" 
      name='chicken'
      value={'b'}
      checked={chicken === 'b'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />양념치킨
      <input 
      type="radio" 
      name='chicken'
      value={'c'}
      checked={chicken === 'c'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />간장치킨
      <br />
      <input 
      type="radio" 
      name='chicken'
      value={'d'}
      checked={chicken === 'd'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />고추바사삭
      <input 
      type="radio" 
      name='chicken'
      value={'e'}
      checked={chicken === 'e'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />뿌링클
      <input 
      type="radio" 
      name='chicken'
      value={'f'}
      checked={chicken === 'f'}
      onChange={e => {
        setChicken(e.target.value);
      }}
      />매운핫치킨
      <br />
      <div>
        <h3>몇마리</h3>
        <input 
        type="number" 
        value={cnt}
        onChange={e => setCnt(e.target.value)} // -마리 안나오게 어캐해요?
        />
      </div>
      <h3>주문일</h3>
      <input 
      type="date" 
      value={date}
      onChange={e => setDate(e.target.value)}
      />
      <br />

      <h3>요청사항</h3>
      <textarea 
      cols='50'
      rows='5'
      value={text}
      onChange={e => setText(e.target.value)}
      >

      </textarea>

    </div>
   
    
  )
}

export default Total2