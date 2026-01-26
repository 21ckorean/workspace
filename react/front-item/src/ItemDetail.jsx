
import axios from 'axios';
import React, { useState } from 'react'

const ItemDetail = () => {
  // const aaa = '';
  // console.log(aaa.itemNum); => undefined => 안보임
  // console.log(null);
  // const aaa = null;
  // console.log(aaa);

  //상세 조회 div 보임/숨기기 여부를 저장하는 state 변수
  const [isShow, setIsShow] = useState(false);

  //입력한 상품번호를 저장할 state 변수
  const [itemNum, setItemNum] = useState('');

  //조회한 상품정보를 저장할 state 변수
  const [itemData, setItemData] = useState({});


  //상품 상세 정보 조회 함수
  const getData = () => {
    axios.get(`http://localhost:8080/items/${itemNum}`)
    .then(response => {
      //자바에서 null값이 전달되면 빈문자('')로 받는다.
      console.log(response.data);
      setItemData(response.data);
    })
    .catch(e => console.log(e));
  }

  return (

    <>
      <h2>상품 상세 조회</h2>
      <div>
        상품번호
        <input 
          type="text"
          value={itemNum}
          onChange={e => {
            setItemNum(e.target.value);
          }} 
        />
        <button 
          type='button'
          onClick={e => {
            setIsShow(true); //상세정보 div 숨김/보이기
            getData(); //상세정보 spring에서 조회
          }}
          >조회</button>
      </div>
      {/* 단락평가 &&앞에가 false면 뒤에꺼 안함*/}
      {
        isShow &&
        <div style={{
          backgroundColor : 'lightgray',
          width : '300px',
          padding : '12px',
          borderRadius : '10px',
          marginTop : '10px'
        }}>
          <p>조회한 상품정보입니다.</p>
          <p>상품번호 : {itemData.itemNum}</p>
          <p>상품명 : {itemData.itemName}</p>
          <p>가격 : {itemData.itemPrice}</p>
          <p>등록일 : {itemData.regDate}</p>
          <p>상품소개 : {itemData.itemIntro}</p>
        </div>
      }
      
    </>

  )
}

export default ItemDetail