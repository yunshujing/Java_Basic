package com.yskye.work2.test5;

public class Book {
    private String bookName;
    private String author;
    private int monthSale;
    // 不带参数的构造方法
    public Book(){}
    // 带参数的构造方法
    public Book(String bookName,String author,int monthSale){
        this.bookName=bookName;
        this.author=author;
        this.monthSale=monthSale;
    }

    public void setBook(String bookName,String author,int monthSale){
        this.bookName=bookName;
        this.author=author;
        this.monthSale=monthSale;
    }
    public void printBook(){
        System.out.println("书名："+bookName+" 作者："+author+" 月销售量："+monthSale);
    }

}
