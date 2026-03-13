import React from 'react'
import Header from './Header'
import styles from './BasicLayout.module.css'
import { Outlet } from 'react-router-dom'

const BasicLayout = () => {
  return (
    <div>
      <Header />
      <div>
        <Outlet />
      </div>
      
   </div>
  )
}

export default BasicLayout