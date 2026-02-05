import axios from "axios";


/**
 * 댓글 목록 조회
 * @param {number} boardNum 게시글번호
 * @returns 
 */
export const getList = async(boardNum) => {
  try{
    const response = await axios.get(`http://localhost:8080/replies/${boardNum}`)
    return response;
  }catch(e){
    console.log('댓글 목록 조회중 오류');
    console.log(e);
  }
}

/**
 * 댓글 등록
 * @param {Object} replyData 등록할 댓글 정보
 * @param {string} replyData.writer 댓글 작성자
 * @param {string} replyData.content 댓글 내용
 * @param {number} replyData.boardNum 댓글이 달릴 게시글 번호
 */
export const save = async (replyData) => {
  try{
    await axios.post(`http://localhost:8080/replies`, replyData)
  }catch(e){
    console.log('댓글 등록중 오류')
    console.log(e)
  }
}

/**
 * 댓글 삭제
 * @param {number} replyNum 삭제할 댓글번호
 */
export const delReply = async (replyNum) => {
  try{
    await axios.delete(`http://localhost:8080/replies/${replyNum}`)
  }catch(e){
    console.log('댓글 삭제중 오류')
    console.log(e)
  }
}
