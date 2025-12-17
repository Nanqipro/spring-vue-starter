package com.goodlab.Demo;

public class Test {
    public static void main(String[] args) {
        // 完成面向对象的综合小案例
        // 1.设计电影类，以便创建电影对象，封装电影数据
        Movie[] movie = new Movie[6];
        movie[0] = new Movie("唐顿庄园",1,9.5,"唐顿·哈迪");
        movie[1] = new Movie("功夫熊猫",2,9.5,"功夫");
        movie[2] = new Movie("让子弹飞",3,9.5,"周润发");
        movie[3] = new Movie("钢铁侠",4,9.5,"托尼");
        movie[4] = new Movie("变形金钢",5,9.5,"汽车人");
        movie[5] = new Movie("美国队长",6,9.5,"史蒂夫");


        MovieOperator movieOperator = new MovieOperator(movie);
        movieOperator.printMovie(movie);
        movieOperator.findById();




    }

}
