import React from 'react'

//const Controller = (props) => {
const Controller = ({setCnt, cnt}) => {
  //console.log(props); => 
  // {
  //    aaa : setCnt(),
  //    bbb : 0
  // }
  //   키    :   밸류 ,  키  : 밸류  

  console.log('controller 컴포넌트가 실행됩니다')

  return (
    <div style={{
      backgroundColor : 'lightgray',
      padding : '12px',
      margin : '12px 0px',
      width : '400px'
    }}>

      <button 
      type='button'
      onClick={e => {setCnt(cnt - 10)}}
      >-10</button>

      <button 
      type='button'
      onClick={e => {setCnt(cnt - 1)}}
      >-1</button>

      <button 
      type='button'
      onClick={e => {setCnt(cnt + 1)}}
      >+1</button>

      <button 
      type='button'
      onClick={e => {props.setCnt(props.cnt + 10)}}
      >+10</button>

    </div>
  )
}

export default Controller