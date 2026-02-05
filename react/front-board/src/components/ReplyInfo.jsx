import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import { delReply, getList, save } from '../api/replyApi';

const ReplyInfo = ({boardNum}) => {
  //댓글 목록 조회 데이터를 저장할 state 변수
  const [replyList, setReplyList] = useState([]);

  //Spring으로 전달할 데이터를 저장하는 state 변수
  const [replyData, setReplyData] = useState({
    writer : '',
    content : '',
    'boardNum' : boardNum   //키값 : 넘어온데이터
  });

  //값 입력 시 실행 함수
  const handleReplyData = (e) => {
    setReplyData({
      ...replyData,
      [e.target.name] : e.target.value
    });
  };

  //마운트 시 댓글 목록 조회
  useEffect(() => {
    getReplyList();
  } , []);

  //댓글 목록 조회 함수
  const getReplyList = async () => {
    const response = await getList(boardNum);
    setReplyList(response.data);
  }

  //댓글 등록 api 호출
  const regReply = async() => {
    //작성자 혹은 댓글 내용이 입력되지 않았으면...
    if(replyData.writer === '' || replyData.content === ''){
      alert('작성자 및 내용은 필수입력입니다.');
      return; //아무것도없는 return이 실행시 아래내용 안하고 함수종료한다.
    }
    //댓글 등록
    await save(replyData);
    //댓글 목록 조회
    getReplyList();   
    //input 태그 초기화
    setReplyData({
      ...replyData,
      writer : '',
      content : ''       
    })
  }




  //댓글 삭제 함수
  const deleteReply = async (replyNum) => {
    const result = confirm('삭제하겠습니까?');

    if(result){
      //댓글 삭제
      await delReply(replyNum);
      //댓글목록조회
      getReplyList();
    }
  }



  return (
    <div style={{marginTop : '20px'}}>
      <div style={{
        display : 'flex',
        gap : '10px'
      }}>
        <input
          style={{width : '20%'}} 
          type="text" 
          name='writer'
          value={replyData.writer}
          onChange={e => handleReplyData(e)}
        />
        <input 
          style={{width : '70%'}} 
          type="text" 
          name='content'
          value={replyData.content}
          onChange={e => handleReplyData(e)}
        />
        <button 
          style={{width : '10%'}} 
          type='button'
          onClick={e => regReply()}
        >댓글등록</button>
      </div>
      <div style={{marginTop : '16px'}}>
      {
        replyList.map((reply, i) => {
          return (
            <div key={i}>
              <div style={{display : 'flex', gap : '8px', alignItems : 'center'}}>
                <img 
                  style={{
                    background : '1px solid lightgray',
                    borderRadius : '50%',
                    width : '30px'
                  }}
                  src="/face-03.jpg"
                />
                <div>
                  <p>{reply.writer}</p>
                  <p style={{color : 'gray'}}>{reply.regDate}</p>
                </div>
              </div>
              <div style={{display:'flex', justifyContent: 'space-between'}}>
                <p>{reply.content}</p>
                <button 
                type='button'
                onClick={e => {deleteReply(reply.replyNum)}}
                >삭제</button>
              </div>
            </div>
          )
        })
      }  
      </div>
    </div>
  )
}

export default ReplyInfo