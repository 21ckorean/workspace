import React, { useState } from 'react'

const Test2t = () => {
  const [display, setDisplay] = useState('ON');
  const [btn, setBtn] = useState('OFF');

  return (
    <>
      <h2>{display}</h2>
      <button type='button' onClick={() => {
        setDisplay(display === 'ON' ? 'OFF' : 'ON');
        setBtn(btn === 'OFF' ? 'ON' : 'OFF')
      }}>{btn}</button>
    </>
   
  )
}

export default Test2t