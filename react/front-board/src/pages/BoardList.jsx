import React from 'react'

const BoardList = () => {
  return (
    <div className='listContainer'>
      <h2>자유게시판</h2>
      <div>
        <select>
          <option value='제목'>제목</option>
          <option value='작성자'>작성자</option>
        </select>
        <input type="text" />
        <button type='button'>검색</button>
      </div>
      <div>
        <table className='table'>
          <thead>
            <tr>
              <td>NO</td>
              <td>제목</td>
              <td>작성자</td>
              <td>작성일</td>
              <td>조회수</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>5</td>
              <td>첫번째글</td>
              <td>김자바</td>
              <td>2026-01-27 17:15:00</td>
              <td>5</td>
            </tr>
            <tr>
              <td>5</td>
              <td>첫번째글</td>
              <td>김자바</td>
              <td>2026-01-27 17:15:00</td>
              <td>5</td>
            </tr>
            <tr>
              <td>5</td>
              <td>첫번째글</td>
              <td>김자바</td>
              <td>2026-01-27 17:15:00</td>
              <td>5</td>
            </tr>
            <tr>
              <td>5</td>
              <td>첫번째글</td>
              <td>김자바</td>
              <td>2026-01-27 17:15:00</td>
              <td>5</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button type='button'>글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList