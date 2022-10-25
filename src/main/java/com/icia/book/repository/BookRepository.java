package com.icia.book.repository;

import com.icia.book.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;

@Repository
public class BookRepository {


    @Autowired
    private SqlSessionTemplate sql;

   public int save(BookDTO bookDTO){
     return sql.insert("Book.bookSave", bookDTO);

       }

    public BookDTO findBook() {
       return sql.selectOne("Book.findBook");
    }
}

