
import React, { useState } from 'react'
import Title from './Title'
import Display from './Display'
import Controller from './Controller'

const Test6 = () => {

  const [cnt, setCnt] = useState(0);


  const printData = () => {
    console.log('111')
    return 10;
  }

  const aa = printData();
  const bb = printData;

  printData();
  bb();
 
  console.log('Test6컴포넌트가 실행됩니다')
  
  return (
    <>
      <div>Test6</div>
      <Title />
      <Display cnt={cnt}/>
      <Controller setCnt={setCnt} cnt={cnt}/>

    </>
   
  )
}

export default Test6