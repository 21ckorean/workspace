package com.green.rest_study;

//게시글 하나의 정보를 저장할 수 있는 자료형

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor  //기본생성자
@AllArgsConstructor //모든매개변수를 가진 생성자
public class BoardDTO {
  private int boardNum;
  private String title;
  private String writer;
  private int readCnt;
}
