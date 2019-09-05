package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

/*
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());

        if (a>=1 && a<=999) {
            if ((a>=1)&&(a<=9))
                if (a%2==0)
                    System.out.println("четное однозначное число");
                else
                    System.out.println("нечетное однозначное число");
            else
                if ((a>=10)&&(a<100))
                    if (a%2==0)
                        System.out.println("четное двузначное число");
                    else
                        System.out.println("нечетное двузначное число");
                else
                    if (a%2==0)
                        System.out.println("четное трехзначное число");
                    else
                        System.out.println("нечетное трехзначное число");

        }


    }
}
