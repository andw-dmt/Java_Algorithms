package ru.mirea.lab1;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        while (scan.hasNextInt())
            array.add(scan.nextInt());
        if (array.isEmpty())
            return;
        int curr;
        int sum = array.getFirst();
        int min = array.getFirst();
        int max = array.getFirst();
        int i = 1;
        do {
            curr = array.get(i);
            sum += curr;
            if (curr < min)
                min = curr;
            if (curr > max)
                max = curr;
            i++;
        } while (i < array.size());
        System.out.printf("sum=%d, min=%d, max=%d", sum, min, max);
    }
}
