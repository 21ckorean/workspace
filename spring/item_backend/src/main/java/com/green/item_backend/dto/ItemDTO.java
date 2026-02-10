package com.green.item_backend.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int price;
  private String itemRegName;
  private String itemGuide;
  private LocalDateTime itemRegDate;
}
