package ru.mirea.lab1;
import java.util.Scanner;
import java.util.Locale;

public class Task_3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        for (int i =0; i<10;i++){
            if (scan.hasNextInt())
                list[i] = scan.nextInt();
            else{
                System.out.println("ERROR");
                return;
            }
        }
        int sum = 0;

        for (int x:list)
            sum+=x;
        double average = sum/10.;
        System.out.printf("sum=%d, average=%.2f", sum, average);


    }
}
