import React, { useState } from 'react'
import styles from './ItemDetail.module.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'

const ItemDetail = () => {
  const nav = useNavigate();

  //입력한 상품번호를 저장할 state 변수
  const [itemNum, setItemNum] = useState('');

  //조회한 상품정보를 저장할 state 변수
  const [detailItemData, setDetailItemData] = useState({});

  //상품 상세정보 조회함수
  const getItem = () => {
    axios.get(`http://localhost:8080/items/${itemNum}`)
    .then(response => {
      setDetailItemData(response.data);
    })
    .catch(e => console.log(e))
  }

  //상품 삭제 함수
  const deleteItem = () => {
    
  }  



  return (
    <div className='container'>
      <div>
        <h1>상품 상세 정보 페이지</h1>
      </div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>등록일</td>
              <td>{detailItemData.itemRegDate}</td>
              <td>등록자</td>
              <td>{detailItemData.itemRegName}</td>
              <td>가격</td>
              <td>{detailItemData.price}</td>
            </tr>
            <tr>
              <td>상품명</td>
              <td colSpan={5}>{detailItemData.itemName}</td>
            </tr>
            <tr>
              <td>상품안내</td>
              <td colSpan={5}>{detailItemData.itemGuide}</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={e => {
            nav('/');
          }}
        >목록가기</button>
        <button 
          type='button'
          onClick={e => {
            deleteItem();
            nav('/');
          }}
        >삭제</button>
      </div>
    </div>
  )
}

export default ItemDetail