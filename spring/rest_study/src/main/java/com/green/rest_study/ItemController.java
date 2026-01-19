package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/items")
public class ItemController {
  private List<ItemDTO> itemList;

  public ItemController(){
    itemList = new ArrayList<>();

    itemList.add(new ItemDTO(1,"A",1000, "samsung"));
    itemList.add(new ItemDTO(2,"B",2000, "apple"));
    itemList.add(new ItemDTO(3,"C",3000, "samsung"));
    itemList.add(new ItemDTO(4,"D",4000, "apple"));
    itemList.add(new ItemDTO(5,"E",5000, "samsung"));
  }

  @GetMapping("")
  public List<ItemDTO> getItemList(){
    System.out.println("상품 목록을 조회합니다");
    return itemList;
  }

  @GetMapping("/{itemNum}")
  public ItemDTO getItem(@PathVariable("itemNum") int itemNum){
    System.out.println(itemNum + "번 상품을 조회합니다");

    ItemDTO result = null;
    for(int i = 0; i < itemList.size(); i++){
      if(itemList.get(i).getItemNum() == itemNum){
        result = itemList.get(i);
      }
    }
    return result;
  }

  @DeleteMapping("/{itemNum}")
  public List<ItemDTO> deleteItem(@PathVariable("itemNum") int itemNum){
    for(int i = 0; i < itemList.size(); i++){
      if(itemList.get(i).getItemNum() == itemNum){
        itemList.remove(i);
      }
    }
    return itemList;
  }
}
