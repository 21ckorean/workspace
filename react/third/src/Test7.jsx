import React, { useState } from 'react'
import './Test7.css'

const Test7 = () => {
  const [] = useState();

  return (
    <>
      <div className='mouse' onMouseEnter={() => {

      }}>마우스를 올리면 숨겨진 글자가 보여요</div>

      <div className='hello' onmouseleave={() => {

      }}>Hello React!</div>
    
    </>
   
  )
}

export default Test7