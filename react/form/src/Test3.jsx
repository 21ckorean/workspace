
import React, { useState } from 'react'
import './Test3.css'

const Test3 = () => {

  const [resume, setResume] = useState({
    education : '대졸',
    schoolName : '',
    experience : '신입',
    certificateName : '', 
    acquisitionDate : '',
    issuingInstitution : '',
    corporateName : '',
    task : '',
    year : '',
    month : '',
    info : ''
  });

  const handleResume = (e) => {
    setResume({
      ...resume,
      [e.target.name] : e.target.value
    });
  }

  console.log(resume);

  return (
    <div className='resume_container'>
      <div className='resume_title'>
        <h1>이력서정보</h1>
        <h3>학력</h3>
        <select 
        name = 'education'
        value = {resume.education}
        onChange={e => handleResume(e)}
        >
          <option value='대졸'>대졸</option>
          <option value='대졸예'>대학졸업예정</option>
          <option value='전졸'>전문대졸</option>
          <option value='고졸'>고졸</option>
        </select>
        <input 
        type="text"
        placeholder='학교명'
        name='schoolName'
        value={resume.schoolName}
        onChange={e => handleResume(e)} 
        />
      </div>

      <div className='resume_experienced'>
        <h3>지원 구분</h3>
        
        <div>
          <input 
          type="radio"
          name='experience'
          value={'신입'}
          checked={resume.experience === '신입'}
          onChange={e => handleResume(e)}
          /><p>신입</p>
        </div>

        <div>
          <input 
          type="radio"
          name='experience'
          value={'경력'}
          checked={resume.experience === '경력'}
          onChange={e => handleResume(e)}
           /><p>경력</p>
        </div>
      </div>

      <div className='resume_qualifications'>
        <h3>자격정보</h3>
        <table className='table_certification'>
          <thead>
            <tr>
              <td>자격증명</td>
              <td>취득일자</td>
              <td>발행기관</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td><input 
            type="text" 
            name='certificateName'
            value={resume.certificateName}
            onChange={e => handleResume(e)}
            /></td>
              <td><input 
            type="date" 
            name='acquisitionDate'
            value={resume.acquisitionDate}
            onChange={e => handleResume(e)}
            /></td>
              <td><input 
            type="text"
            name='issuingInstitution'
            value={resume.issuingInstitution}
            onChange={e => handleResume(e)}
            /></td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className='resume_workexperience'>
        <h3>경력정보</h3>
        <table>
          <thead>
            <tr>
              <td>회사명</td>
              <td>담당업무</td>
              <td>경력기간</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td><input 
          type="text" 
          name='corporateName'
          value={resume.corporateName}
          onChange={e => handleResume(e)}
          /></td>
              <td><input 
          type="text" 
          name='task'
          value={resume.task}
          onChange={e => handleResume(e)}
          /></td>
              <td><input 
          type="text" 
          name='year'
          value={resume.year}
          onChange={e => handleResume(e)}
          />년
          <input 
          type="text"
          name='month' 
          value={resume.month}
          onChange={e => handleResume(e)}
          />개월
          </td>
            </tr>
          </tbody>
        </table>
      </div>

      <div className='resume_introduce'>
        <h3>자기소개</h3>
        <textarea
        cols='80'
        rows='5'
        name='info'
        value={resume.info}
        onChange={e => handleResume(e)}
        
        ></textarea>
      </div>
      




    </div>
  )
}

export default Test3