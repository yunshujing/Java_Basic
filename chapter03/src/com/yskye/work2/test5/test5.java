package com.yskye.work2.test5;

public class test5 {
    public static void main(String[] args) {
        Book book1 = new Book();
        // 用setBook方法设置属性值
        book1.setBook("Java编程思想", "Bruce Eckel", 10000);
        book1.printBook();

        // 用构造方法设置属性值
        System.out.println("===================================");
        Book[] book = new Book[3];
        book[0] = new Book("Java编程思想", "Bruce Eckel", 10000);
        book[1] = new Book("Java核心技术", "Cay S. Horstmann", 8000);
        book[2] = new Book("Effective Java", "Joshua Bloch", 12000);
        book[0].printBook();
        book[1].printBook();
        book[2].printBook();
    }
}
