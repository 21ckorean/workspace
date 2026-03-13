import React from 'react'
import styles from './Button.module.css'
const Button = ({
  title = '등록',
  
}) => {
  return (
    <button>
      {title}
    </button>
  )
}

export default Button