package com.green.board.service;
import com.green.board.dto.BoardDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//실제 쿼리 기능을 구현할 클래스

//초기세팅
//1. @Service 어노테이션 클래스명 위에 선언
//  -> 객체 생성 + 이 클래스가 핵심기능(DB기능)이 구현된 클래스라는 것을 스프링한테 알려줌
//2. 쿼리 실행 메서드를 호출하기 위해
//2-1) Mapper Interface 객체를 맴버변수로 선언
//2-2) 생성자 의존성 주입 문법을 사용해서 Mapper Interface 객체를 생성

@Service
public class BoardService {
  private BoardMapper boardMapper;

  //2-2코드
  //생성자 의존성 주입
  @Autowired //생성자가 하나라면 @autowired 어노테이션 생략가능. 왜 why? 자동으로 생성됨.
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //게시글 목록 조회 기능
  public List<BoardDTO> getList(){
              //객체명.메서드호출();;
    List<BoardDTO> list = boardMapper.selectBoardList();
    return list;
  }


}
