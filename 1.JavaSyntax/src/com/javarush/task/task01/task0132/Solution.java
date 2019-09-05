package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum =0;
        int div=100;
        for (int i = 3; i > 0; i--) {
            sum+=number/div;
            number-= div*(number/div);
            div/=10;
        }

        return sum;
    }
}