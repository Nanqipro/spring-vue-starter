package com.itheima.interfacedemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{
    private String name;
    private char sex;
    private double score;

}