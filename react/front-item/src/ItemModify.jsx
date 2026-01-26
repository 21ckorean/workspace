
import axios from 'axios';
import React, { useState } from 'react'

const ItemModify = () => {
  //인풋태그에 입력한 정보를 저장하는 state 변수
  const [updateData, setUpdateData] = useState({
    itemNum : '',
    itemName : '',
    itemPrice : ''
  });

  //키 입력할때마다 실행되는 함수
  const handleUpdateData = e => {
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    })
  }

  //상품 수정 함수
  const updateItem = e => {
    axios.put(`http://localhost:8080/items/${updateData.itemNum}`, updateData) //post, put은 매개변수 2개줘야함. 두번째는 객체로 줘야함. get,delete는 1개.
    .then(response => alert('수정 성공!'))
    .catch(e => console.log(e))
  }

  return (

    <>
      <div>
        상품번호 
        <input 
          type="text" 
          name='itemNum'
          value={updateData.itemNum}
          onChange={e => handleUpdateData(e)}
        />
      </div>
      <div>
        상품명 
        <input 
          type="text"
          name='itemName' 
          value={updateData.itemName}
          onChange={e => handleUpdateData(e)}
        />
      </div>
      <div>
        가격 
        <input 
        type="text"
        name='itemPrice' 
        value={updateData.itemPrice}
        onChange={e => handleUpdateData(e)}
        />
      </div>
      <button 
        type='button'
        onClick={e => {
          updateItem();
        }}
      >
      수정
      </button>
    </>

  )
}

export default ItemModify