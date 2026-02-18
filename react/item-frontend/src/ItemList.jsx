import React, { useEffect, useState } from 'react'
import styles from './ItemList.module.css'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';



const ItemList = () => {
   const nav = useNavigate()

  //조회한 상품목록 데이터를 저장할 state변수
  const [itemList, setItemList] = useState([]);

  //마운트되면 스프링에서 데이터가져오기
  useEffect(() => {
    axios.get('http://localhost:8080/items')
    .then((response) => {
      console.log(response.data);
      setItemList(response.data);
    })
    .catch(e => console.log(e))
  }, []);


  return (
    <div>
      <div>
        <h1>상품목록</h1>
      </div>

      <div>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>가격</td>
              <td>상품등록자</td>
              <td>등록일</td>
            </tr>
          </thead>
          <tbody>
            {
              itemList.length !=0
              ?
              itemList.map((item, i) => {
                return(
                  <tr key={i}>
                    <td>{item.itemNum}</td>
                    <td>{item.itemName}</td>
                    <td>{item.price}</td>
                    <td>{item.regName}</td>
                    <td>{item.regDate}</td>
                  </tr>
                )
              })
              :
              <tr>
                <td colSpan={5}>조회된 상품이 없습니다.</td>
              </tr>
            }
          </tbody>
        </table>
      </div>

      <div>
        <button 
          type='button'
          onClick={e => {nav('/items')}}
        >상품등록</button>
      </div>

    </div>
  )
}

export default ItemList