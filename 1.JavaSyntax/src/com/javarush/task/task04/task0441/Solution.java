package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ((a>=b)&&(b>=c))
            System.out.println(b);
        else if ((b>=c)&&(c>=a))
            System.out.println(c);
        else if ((c>=a)&&(a>=b))
            System.out.println(a);
        else if ((c>=a)&&(a>=b))
            System.out.println(a);
        else if ((c>=b)&&(b>=a))
            System.out.println(b);
        else if ((b>=a)&&(a>=c))
            System.out.println(a);
        else if ((a>=c)&&(c>=b))
            System.out.println(c);




    }
}
