import React, { useState } from 'react'

const Test3 = () => {
  const [btn, setBtn] = useState('광고닫기');
  const [isShow, setIsShow] = useState(true);
  return (
    <>
    <button type='button' onClick={() => {
      setBtn(btn === '광고닫기' ? '광고열기' : '광고닫기')
      setIsShow(!isShow)
    }}>{btn}</button>

    {
      isShow 
      ? 
      <h2>
        오늘 구매하시면 30% SALE!!!
      </h2>
      :
      null
    }
    </>
  )
}

export default Test3