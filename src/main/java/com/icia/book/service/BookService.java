package com.icia.book.service;

import com.icia.book.dto.BookDTO;
import com.icia.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public boolean bookSave(BookDTO bookDTO){

      int insertResult = bookRepository.save(bookDTO);

        if (insertResult > 0){
            return true;
        }else {
           return false;
        }




    }


    public BookDTO findBook() {
       BookDTO findResult=bookRepository.findBook();
       return bookRepository.findBook();

    }


    public List<BookDTO> findAll() {
        return bookRepository.findAll();
    }

   /* 리턴타입 :
   * 매개변수:
   * 매서드이름:
   * */

    public BookDTO findById(Long bookId) {
        return bookRepository.findById(bookId);
    }
}




