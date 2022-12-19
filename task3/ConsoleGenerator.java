package Lesson_10.task3;

import java.util.Scanner;

public class ConsoleGenerator implements IntGenerator{

    @Override
    public int getInt() {
        Scanner scn=new Scanner(System.in);
        System.out.println("Input your number: ");
        int num=scn.nextInt();
        return num;
    }
}
