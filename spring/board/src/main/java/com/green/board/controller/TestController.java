package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test1")
  public ResponseEntity<String> test1() {  //<>안에는 실제로 body안에 들어가는 변수?의 자료형이 들어가면됨
    String name = "kim";

    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(name);

//    return ResponseEntity
//            .status(HttpStatus.OK)
//            .body(name);  //OK는 200번이랑똑같음.
  }

  @GetMapping("/test2")
  public ResponseEntity<BoardDTO> test2() {
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(1);
    dto.setTitle("제목");
    dto.setWriter("작성자");
    dto.setContent("내용");

    //헤더에 실을 데이터
    HttpHeaders header = new HttpHeaders();
    header.add("myName", "kim");
    header.add("myAge", "30");

    return ResponseEntity.status(HttpStatus.CREATED).headers(header).body(dto);
  }

  @GetMapping("/test3")
  public ResponseEntity<?> test3(){ //<>안에 ? 쓰면 해결됨. 와일드카드라는데 나중에설명해줌..
    System.out.println("기능성공");
    //return할 데이터가 없으면 build() 메서드를 마지막에 호출!
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }



}