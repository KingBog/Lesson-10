package Lesson_10.task2;

import java.util.Scanner;

public class ManualCar extends Car {
    public ManualCar(int currentGear, int max_Gear) {
        super(currentGear, max_Gear);
    }

    Scanner scn = new Scanner(System.in);
    int gear;

    @Override
    public String toString() {
        return "ManualCar{" +
                "scn=" + scn +
                ", gear=" + gear +
                '}';
    }

    @Override
    void gas() {
        System.out.println("Введите нужною передачу: ");
        gear = scn.nextInt();
        if (getMax_Gear() > gear && gear >= 1) {
            gear++;
            setCurrentGear(gear);

            System.out.println("Теперь ваша передача " + getCurrentGear());
        } else {
            System.out.println("Некоректная передача");
        }


    }

    @Override
    void tormoz() {
        System.out.println("Введите нужною передачу: ");
        gear = scn.nextInt();
        if (getMax_Gear() >= gear && gear >= 2) {
            setCurrentGear(gear);

            System.out.println("Теперь ваша передача " + (getCurrentGear() - 1));
        } else {
            System.out.println("Некоректная передача");
        }


    }
}





