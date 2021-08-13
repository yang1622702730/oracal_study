package com.fanyang.java.exercise2;


/**
 * @program: OracleStudy
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 09:25
 */
public class User {
    private Book[] book = new Book[20];
    public int countBook = 0;
    private int id;
    private String userName;
    private String birthday;
    private String types;

    public User() {
    }

    public User(int id, String userName, String birthday) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
    }

    public User(Book[] book, int id, String userName, String birthday) {
        this.book = book;
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
    }

    public User(int id, String userName, String birthday, String types) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.types = types;
    }

    public User(Book[] book, int id, String userName, String birthday, String types) {
        this.book = book;
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.types = types;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getCountBook() {
        return countBook;
    }

    public void setCountBook(int countBook) {
        this.countBook = countBook;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book[countBook] = book;
    }

    @Override
    public String toString() {
//        if (null == book) {
        return "用户信息：" +
                " id=" + id +
                " userName='" + userName + '\'' +
                " birthday='" + birthday + '\'' +
                " types='" + types;
    }
//    }
//        return "用户信息：" +
//                " id=" + id +
//                " userName='" + userName + '\'' +
//                " birthday='" + birthday + '\'' +
//                " types='" + types + '\'' +
//                " book{" + book+"}";
//    }

    /*
     * @Description: 打印当前用户的书籍信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/31 10:23
     */
    public void bookInfo() {
//        System.out.println("hhhsdsd");
//        System.out.println(countBook);
        for (int i = 0; i < this.countBook; i++) {

            System.out.println(book[i].toString());
        }
    }
}
