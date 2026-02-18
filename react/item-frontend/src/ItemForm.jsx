import React, { useState } from 'react'
import styles from './ItemForm.module.css'
import axios from 'axios';
const ItemForm = () => {

  //입력한 데이터를 저장할 state 변수
  const [itemData, setItemData] = useState({
    itemName : '',
    price : '',
    itemRegName : '',
    itemGuide : ''
  })

  //키 입력마다 실행되는 함수
  const handleItemData = (e) => {
    setItemData({
      ...itemData,
      [e.target.name] : e.target.value
    });
  };

  //등록버튼 누르면 스프링 실행
  const regItem = () => {
    axios.post('http://localhost:8080/items', itemData)
    .then(response => {
      alert('등록성공')
    })
    .catch(e => console.log(e))
  }

  return (
    <div>
      <div>
        <h2>상품등록</h2>
      </div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>
                상품명
              </td>
              <td>
                <input 
                  type="text" 
                  name='itemName'
                  value={itemData.itemName}
                  onChange={(e) => {handleItemData(e)}}
                />
              </td>
            </tr>
            <tr>
              <td>
                가격
              </td>
              <td>
                <input 
                  type="text" 
                  name='price'
                  value={itemData.price}
                  onChange={(e) => {handleItemData(e)}}           
                />
              </td>
            </tr>
            <tr>
              <td>
                등록자명
              </td>
              <td>
                <input 
                  type="text" 
                  name='itemRegName'
                  value={itemData.itemRegName}
                  onChange={(e) => {handleItemData(e)}}
                />
              </td>
            </tr>
            <tr>
              <td>
                상품안내
              </td>
              <td>
                <textarea 
                  cols={60}
                  rows={6}
                  name='itemGuide'
                  value={itemData.itemGuide}
                  onChange={(e) => {handleItemData(e)}} 
                >
                </textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button 
          type='button'
          onClick={(e) => {
            {
              itemData.itemName == '' ||
              itemData.price == ''
              ?
              alert('상품명과 가격을 입력해주세요')
              :
              regItem();
            }            
          }}
        >
          등록
        </button>
      </div>
    </div>
  )
}

export default ItemForm