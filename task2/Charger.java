package Lesson_10.task2;

public class Charger extends ManualCar{
    public Charger(int currentGear, int max_Gear) {
        super(currentGear, max_Gear);
    }

    @Override
    public String toString() {
        return "Charger";
    }
}
