package com.green.rest_study;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@RestController
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int itemPrice;
  private String brand;
}
