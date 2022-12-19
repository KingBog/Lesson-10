package Lesson_10.task2;

public class Mustang extends ManualCar{
    public Mustang(int currentGear, int max_Gear) {
        super(currentGear, max_Gear);
    }

    @Override
    public String toString() {
        return "Mustang";
    }
}
