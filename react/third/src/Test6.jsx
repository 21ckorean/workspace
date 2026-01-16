
import React, { useState } from 'react'
import './Test6.css'
const Test6 = () => {

  const [cnt, setCnt] = useState(0);

  return (
    <>
      <h3>Simple Counter</h3>
      <div className=''>
        <div>현재 카운트 : </div>
        <h4>{cnt}</h4>
      </div>
      <button type='button' onClick={() => {
        setCnt(num-1);
      }}>-1</button>
      <button type='button' onClick={() => {
        setCnt(num-10);
      }}>-10</button>
      <button type='button' onClick={() => {
        setCnt(num-100);
      }}>-100</button>
      <button type='button' onClick={() => {
        setCnt(num+100);
      }}>+100</button>
      <button type='button' onClick={() => {
        setCnt(num+10);
      }}>+10</button>
      <button type='button' onClick={() => {
        setCnt(num+1);
      }}>+1</button>

    
    </>
   
  )
}

export default Test6