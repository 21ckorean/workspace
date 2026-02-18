package com.green.item_backend.mapper;

import com.green.item_backend.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

  //상품 목록 조회 추상메서드
  public List<ItemDTO> selectItemList(ItemDTO itemDTO);

  //상품 등록 추상메서드

}



