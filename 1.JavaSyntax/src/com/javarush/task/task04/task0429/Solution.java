package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int num_p=0;
        int num_o=0;
        if (a>0)num_p++;else if (a<0) num_o++;
        if (b>0)num_p++;else if (b<0) num_o++;
        if (c>0)num_p++;else if (c<0) num_o++;

        System.out.println("количество отрицательных чисел: "+num_o);
        System.out.println("количество положительных чисел: "+num_p);
    }
}
