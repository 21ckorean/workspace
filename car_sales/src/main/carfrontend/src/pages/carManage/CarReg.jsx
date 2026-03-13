import React from 'react'
import styles from './CarReg.module.css'
import Button from '../../components/common/Button'
import Select from '../../components/common/Select'
import Input from '../../components/common/Input'
import Table from '../../components/common/Table'

const CarReg = () => {
  


  return (
    <div className={styles.car}>
      <div className={styles.reg}>
        <div>
          <h2>차량 등록</h2>
        </div>
        <div style={{border:'1px solid red'}}>
          <div>
            <p>제조사</p>
            <Select>
              <option value="1">현대</option>
              <option value="2">기아</option>
            </Select>
          </div>
          <div>
            <p>모델명</p>
            <Input />
          </div>
          <div>
            <p>차량가격</p>
            <Input />
          </div>
        </div>
        <div>
          <Button />
        </div>
      </div>

      <div className={styles.regList}>
        <Table>
          <colgroup>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
          </colgroup>
          <thead>
            <tr>
              <td>NO</td>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
            {/* 맵써야됨 */}
            <tr>
              <td>{}</td>
              <td>{}</td>
              <td>{}</td>
              <td>{}</td>
            </tr>
          </tbody>
        </Table>
      </div>
    </div>
  )
}

export default CarReg