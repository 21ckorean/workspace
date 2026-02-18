package com.green.item_backend.service;

import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
  private ItemMapper itemMapper;

  @Autowired
  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }

  //상품 목록 조회 기능
  public List<ItemDTO> getList(ItemDTO itemDTO){
    List<ItemDTO> list = itemMapper.selectItemList(itemDTO);
    return  list;
  }

}
