package com.green.restApi_test;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;

//1)
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class BookDTO {
  private int bookNum;
  private String bookTitle;
  private String author;
  private String bookIntro;
  private int bookPrice;
}
