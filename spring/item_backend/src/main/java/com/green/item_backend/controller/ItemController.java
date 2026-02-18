package com.green.item_backend.controller;

import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.mapper.ItemMapper;
import com.green.item_backend.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    //상품 목록 조회 api
    //(GET) localhost:8080/items
    @GetMapping("")
    public ResponseEntity<?> getItemList(ItemDTO itemDTO){
        try{
            log.info("상품목록조회");
            List<ItemDTO> list = itemService.getList(itemDTO);
            return ResponseEntity.status(HttpStatus.OK).body(list);
        }catch(Exception e){
            log.error("상품목록조회중 오류");
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //상품 등록 api
    //(POST) localhost:8080/items



}
