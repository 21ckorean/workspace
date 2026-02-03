package com.green.restApi_test;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
  private List<BookDTO> bookDTOList;

  //1)
  public BookController(){
    bookDTOList = new ArrayList<>();

    bookDTOList.add(new BookDTO(1, "java", "김자바", "인트로1", 1000));
    bookDTOList.add(new BookDTO(2, "spring", "이자바", "인트로2", 2000));
    bookDTOList.add(new BookDTO(3, "db", "박자바", "인트로3", 3000));
    bookDTOList.add(new BookDTO(4, "javaScript", "최자바", "인트로4", 4000));
    bookDTOList.add(new BookDTO(5, "react", "윤자바", "인트로5", 5000));

  }

  //2) 모든 도서정보 조회하는 기능을 제공하는 REST API
  //URL -> (GET) localhost:8080/books
  @GetMapping("")
  public List<BookDTO> getBookList(){
    System.out.println("모든 도서정보를 조회합니다.");
    return bookDTOList;
  }

  //3) 하나의 도서정보를 조회하는 기능을 제공하는 REST API
  //URL -> (GET) localhost:8080/books/1
  @GetMapping("/{bookNum}")
  public BookDTO getBook(@PathVariable("bookNum") int bookNum){
    System.out.println(bookNum + "번 도서를 조회합니다.");

    BookDTO result = null;
    for(BookDTO e : bookDTOList){
      if(e.getBookNum() == bookNum){
        result = e;
      }
    }
    return result;
  }

  //4) 하나의 도서정보를 등록하는 기능을 제공하는 REST API
  //URL -> (POST) localhost:8080/books
  @PostMapping("")
  public void regBook(@RequestBody BookDTO bookDTO){

    System.out.println(bookDTO);
    bookDTOList.add(bookDTO);
  }

  //5) 하나의 도서정보를 삭제하는 기능을 제공하는 REST API
  //URL -> (DELETE) localhost:8080/books/1
  @DeleteMapping("/{bookNum}")
  public List<BookDTO> deleteBook(@PathVariable("bookNum") int bookNum){
    System.out.println("삭제 글번호 : " + bookNum);
    for(int i = 0; i < bookDTOList.size(); i++){
      if(bookDTOList.get(i).getBookNum() == bookNum){
        bookDTOList.remove(i);
      }
    }
    return bookDTOList;
  }

  //6) 하나의 도서정보에 도서명과 저자, 도서가격을 수정하는 기능을 제공하는 REST API
  @PutMapping("/{bookNum}")
  public void updateBook(@PathVariable("bookNum") int bookNum, @RequestBody BookDTO bookDTO){
    System.out.println("수정 글번호 : " + bookNum);
    for(BookDTO e : bookDTOList){
      if(e.getBookNum() == bookNum){
        e.setBookTitle(bookDTO.getBookTitle());
        e.setAuthor(bookDTO.getAuthor());
        e.setBookPrice(bookDTO.getBookPrice());
      }
    }
  }
}
