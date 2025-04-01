package com.yskye.movie;

public class Test {
    public static void main(String[] args) {
        // 目标：完成面向对象的综合小案例
        // 1、设计电影类Movie，以便创建电影对象，封装电影数据。
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "《三傻大闹宝莱坞》", 20.0, "阿米尔·汗");
        movies[1] = new Movie(2, "《大话西游》", 18.0, "周星驰");
        movies[2] = new Movie(3, "《大话西游之月光宝盒》", 16.0, "周星驰");
        movies[3] = new Movie(4, "《大话西游之天龙八部》", 14.0, "周星驰");
        movies[4] = new Movie(5, "《大话西游》", 16.0, "周星驰");
        movies[5] = new Movie(6, "《大话西游之仙游记》", 16.0, "周星驰");
        // 3、创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
