package Lesson_10.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Service serviceRandom=new Service(new RandomGenerator());
      Service serviceConsol=new Service(new ConsoleGenerator());
      int consol=serviceConsol.readInt();
      int randonm=serviceRandom.readInt();
        System.out.println("Сумма двух чисел:"+consol+"+"+randonm+"="+(consol+randonm));



        }
    }

