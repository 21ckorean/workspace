import React from 'react'
import styles from './Header.module.css'
import { Link } from 'react-router-dom'
import Table from '../common/Table'

const Header = () => {
  return (
    <div>
      <div className={styles.top_menu}>
        <Table>
          <colgroup>
            <col width='25%' />
            <col width='25%' />
            <col width='25%' />
            <col width='25%' />
          </colgroup>
          <thead>
            <tr>
              <td>
                <Link to='/'>홈</Link>
              </td>
              <td>
                <Link to='/carReg'>차량관리</Link>
              </td>
              <td>
                <Link to='/salesReg'>판매정보등록</Link>
              </td>
              <td>
                <Link to='/salesList'>판매목록조회</Link>
              </td>
            </tr>
          </thead>
        </Table>
      </div>
    </div>
  )
}

export default Header