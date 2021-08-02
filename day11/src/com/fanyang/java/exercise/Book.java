package com.fanyang.java.exercise;

/**
 * @project_name: OracleStudy
 * @project_description:
 * @author: FanYang
 * @create_date: ${}-07-31 08:59
 */
public class Book {
    private String bookName;
    private int value;
    private String author;

    public Book() {
    }

    public Book(String bookName, int value) {
        this.bookName = bookName;
        this.value = value;
    }

    public Book(String bookName, int value, String author) {
        this.bookName = bookName;
        this.value = value;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return " 书名:'" + bookName + '\'' +
                " 作者:" + author +
                " 价值:'" + value ;
    }
}
