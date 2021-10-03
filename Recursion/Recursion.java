package com.Recursion;

import java.util.Scanner;

public class Recursion {
    private int num = 0;

    static Scanner in = new Scanner (System.in);

    // Вывод чисел от 1 до N
    public void rec1(int n){
        if ( num != n) {
            num += 1;
            System.out.println(num);
            rec1(n);
        }
    }

    //Вывод чисел между A и B
    public void rec2(int a, int b, int c, boolean f){
        if (a == b){
            System.out.println(a);
            f = false;
        }
        while(f = true)
            if(a < b && a != b) {
                System.out.println(a);
                a += 1;
                rec2(a, b, c, f);
            }
            else if (a > b && a != b){
                System.out.println(a);
                a -= 1;
                rec2(a, b, c, f);
            }
            else
                f = false;
        }

        //Сумма цифр числа N
        public void rec3(int n, int div, int sum){
            if (n !=0 ){
                div = n % 10;
                n = n / 10;
                sum += div;
                rec3(n, div, sum);
            }
            else
                System.out.println(sum);
        }
}
