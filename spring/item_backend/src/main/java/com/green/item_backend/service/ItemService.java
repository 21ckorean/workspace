package com.green.item_backend.service;

import com.green.item_backend.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
  private ItemMapper itemMapper;

  @Autowired
  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }


}
