package ru.mirea.lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_7 {
    public static BigInteger fact(int num) {
        if (num < 1)
            return BigInteger.ZERO;
        if (num == 1)
            return BigInteger.ONE;
        BigInteger value = new BigInteger("1");
        BigInteger x = new BigInteger("2");
        for (int i = 2; i <= num; i++) {
            value = value.multiply(x);
            x = x.add(BigInteger.ONE);
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Введите целое число: ");
        if (scan.hasNextInt())
            n = scan.nextInt();
        else {
            System.out.println("Вы ввели не целое число.");
            return;
        }
        BigInteger rez = fact(n);
        System.out.println(rez);
    }
}
