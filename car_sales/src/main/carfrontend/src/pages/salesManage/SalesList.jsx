import React, { useState } from 'react'
import styles from './SalesList.module.css'
const SalesList = () => {

  //판매정보 목록을 저장하는 state 변수
  const [salesList, setSalesList] = useState([]);

  //조회한 등록된 차량목록 정보를 저장할 state변수
  const [carList, setCarList] = useState([])

  //판매정보에


  return (
    <div className={styles.container}>
      <table className={styles.salesList}>
        <colgroup>
          <col width='5%'/>
          <col width='10%'/>
          <col width='25%'/>
          <col width='18%'/>
          <col width='12%'/>
          <col width='15%'/>
          <col width='15%'/>
        </colgroup>
        <thead>
          <tr>
            <td rowSpan={2}>No</td>
            <td colSpan={4}>구매자정보</td>
            <td colSpan={2}>차량정보</td>
          </tr>
          <tr>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>가격</td>
          </tr>
        </thead>
        <tbody>
          {
            salesList.length === 0
            ?
            <tr>
              <td colSpan={7}>판매정보가 조회되지 않습니다.</td>
            </tr>
            :
            salesList.map((sales, i) => {
              return(
                <tr key={i}>
                  <td>{salesList.length - i}</td>
                  <td>{sales.customerName}</td>
                  <td>{sales.customerPhone}</td>
                  <td>{sales.saleDate}</td>
                  <td>{sales.modelColor}</td>
                
                </tr>
              )
            })
          }
          
         
        </tbody>
      </table>
    </div>
  )
}

export default SalesList