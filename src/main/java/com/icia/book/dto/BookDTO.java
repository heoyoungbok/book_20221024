package com.icia.book.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class BookDTO {

    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPrice;
    private String bookPublisher;

//
//    public BookDTO() {
//
//    }



    public Long getBookId() {
        return bookId;
    }

    public void setBookid(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;

    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookid=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}
