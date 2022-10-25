package com.icia.book.controller;

import com.icia.book.dto.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@Controller
public class BookController {

   @Autowired
   private BookService bookService;

   @GetMapping("/save")
    public String saveForm(){
       return "bookSave";
   }

   @PostMapping("/save")
   public String save(@ModelAttribute BookDTO bookDTO, Model model){
      System.out.println("bookDTO = " + bookDTO );
      boolean result = bookService.bookSave(bookDTO);
      model.addAttribute("result",result);
      return "saveResult";

   }

@GetMapping("/findBook")
   public String findBook(Model model){
     BookDTO findResult = bookService.findBook();
     model.addAttribute("book",findResult);
     return "findBook";
}
@GetMapping("/books")
    public String findAll(Model model) {
    List<BookDTO> bookList = bookService.findAll();
    model.addAttribute("bookList",bookList);
    return "bookList";
}

@GetMapping("/book")
    public String findById(@RequestParam("bookId")Long bookId,Model model){
     BookDTO bookDTO = bookService.findById(bookId);
     model.addAttribute("book",bookDTO);
    return "findBook";

}


}
