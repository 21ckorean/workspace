import React, { useState } from 'react'

const Test2 = () => {
  const [display, setDisplay] = useState('ON');
  const [btn, setBtn] = useState('OFF');

  let result1 = display === 'ON' ? 'OFF' :'ON';
  let result2 = btn === 'OFF' ? 'ON' : 'OFF';
  return (
    <>
      <div>{display}</div>  
      <button type='button' onClick={() => {
        setDisplay(result1);
        setBtn(result2);
      }}>{btn}</button>
    </>
   
  )
}

export default Test2