import React from 'react'

const ItemList = () => {
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
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
        </table>
      </div>

      <div>
        <button 
          type='button'
        >상품등록</button>
      </div>

    </div>
  )
}

export default ItemList