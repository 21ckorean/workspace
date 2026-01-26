package com.green.basic_board.mapper;

import org.apache.ibatis.annotations.Mapper;

//인터페이스 안에는 추상메서드만 올 수 있음!
@Mapper //xml파일에서 만든 쿼리문을 실행시키는 interface라 것을 지정하는 어노테이션
public interface BoardMapper {
  //추상메서드명은 반드시 xml 파일에서 정의한 쿼리의 id로 일치!!



}
