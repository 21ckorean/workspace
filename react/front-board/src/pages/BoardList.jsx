import React, { useEffect, useState } from 'react'
import styles from './BoardList.module.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'


///컴포넌트가 마운트될때 게시글 목록을 spring에서 조회한 후 화면에 띄워준다
const BoardList = () => {
  const nav = useNavigate();



  //조회한 게시글 목록 데이터를 저장할 state변수
  const [boardList, setBoardList] = useState([]);

  //마운트 시 게시글 목록 조회
  useEffect(() => {
    axios.get('http://localhost:8080/boards')
    .then(response => {
      console.log(response.data)
      setBoardList(response.data);
    })
    .catch(e => console.log(e));
  }, []);
    

  return (
    <div className={styles.Container}>
      <h2>자유게시판</h2>

      <div className={styles.search_div}>
        <select>
          <option value='제목'>제목</option>
          <option value='작성자'>작성자</option>
        </select>
        <input type="text" />
        <button type='button'>검색</button>
      </div>

      <div className={styles.list_div}>
        <table className={styles.list_table}>
          {/* 테이블에서 각 컬럼의 너비값 지정 <colgroup> */}
          {/* 중괄호를 쓰던 ''안에쓰던 상관없음 */}
          <colgroup>
            <col width='5%'/> 
            <col width='*'/>
            <col width='12%'/>
            <col width='30%'/>
            <col width='12%'/>
          </colgroup>
          <thead>
            <tr>
              <td>NO</td>
              <td>제 목</td>
              <td>작성자</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
           {
              boardList.map((board, i) => {
                return(
                  <tr key={board.boardNum}>
                    <td>{boardList.length - i}</td>
                    <td>
                      {/* span태그는 인라인요소라서 데이터크기만큼만 */}
                      <span onClick={e => {nav(`/detail/${board.boardNum}`)}}>
                        {board.title}
                      </span>
                    </td>
                    <td>{board.writer}</td>
                    <td>{board.createDate}</td>
                    <td>{board.readCnt}</td>
                  </tr>
                )
              })
           }
          </tbody>
        </table>
      </div>

      <div className={styles.btn_div}>
        <button 
        type='button'
        onClick={e => {nav('/reg')}}
        >글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList