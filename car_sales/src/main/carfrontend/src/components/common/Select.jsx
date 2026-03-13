import React from 'react'
import styles from './Select.module.css'
const Select = ({children}) => {
  return (
    <select className={styles.select}>
      {children}
    </select>
  )
}

export default Select