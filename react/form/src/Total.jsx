
import React, { useState } from 'react'

const Total = () => {

  const [name, setName] = useState('');
  const [age, setAge] = useState('');
  const [grade, setGrade] = useState('1');
  const [sex, setSex] = useState('male');
  const [text, setText] = useState('');

  

  return (
    <div className='total_container'>
    이름
    <input 
    type="text"
    value={name}
    onChange={e => setName(e.target.value)}
    />
    <br />
    
    나이
    <input 
    type="text"
    value={age}
    onChange={e => setAge(e.target.value)}
    />
    <br />

    학년
    <select value={grade} onChange={e => {
      setGrade(e.target.value);
    }}>
      <option value='1'>1학년</option>
      <option value='2'>2학년</option>
      <option value='3'>3학년</option>
    </select>
    <br />

    성별
    <input 
    type="radio" 
    name='sex'
    value={'male'}
    checked = {sex === 'male'}
    onChange={e => {
      setSex(e.target.value);
    }}
    />남자
    <input 
    type="radio" 
    name='sex'
    value={'female'}
    checked = {sex === 'female'}
    onChange={e => {
      setSex(e.target.value);
    }}
    />여자
    <br />

    소개말
    <textarea 
    cols='50' 
    rows='5'
    value={text}
    onChange={e => {
      setText(e.target.value);
    }}
    >
    </textarea>
    </div>
   
  )
}

export default Total