package com.goodlab.Demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator() {

    }

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public void findById() {
        System.out.println("请输入你要查询的ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for(int i = 0;i<movies.length;i++){
            if(movies[i].getId() == id){
                System.out.println(movies[i].getName() + "\t"+movies[i].getPrice()+ "\t"+movies[i].getActor());
                return;
            }
        }
        System.out.println("没有找到该ID");

    }

    public void printMovie(Movie[] movie) {
        System.out.println("==========正在打印电影列表=========");
        System.out.println("编号\t"+"电影名称\t"+"价格\t"+"主演");
        for(int i = 0;i<movie.length;i++){
            System.out.println(movie[i].getId()+ "\t"+movie[i].getName()+ "\t"+movie[i].getPrice()+ "\t"+movie[i].getActor());
        }

    }
}
