package Lesson_10.task2;

public class AutoCar extends Car{

    public AutoCar(int currentGear, int max_Gear) {
        super(currentGear, max_Gear);
    }

    @Override
    void gas() {
        if (getMax_Gear()>getCurrentGear()&&getCurrentGear()>=1) {
            System.out.println("Теперь ваша передача "+(getCurrentGear()+1));
        }else{
            System.out.println("404");
        }
    }

    @Override
    public String toString() {
        return "AutoCar{}";
    }

    @Override
    void tormoz() {
        if (getMax_Gear()>getCurrentGear()&&getCurrentGear()>=1) {
            System.out.println("Теперь ваша передача "+(getCurrentGear()-1));
        }else{
            System.out.println("404");
        }




    }
}
