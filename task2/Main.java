package Lesson_10.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
      ArrayList <Car>list=new ArrayList<>();
      list.add(new Mustang(2,5));
      list.add(new Charger(3,6));
      list.add(new Rio(4,5));
      list.add(new Almera(1,5));
      for (Car car:list) {
        car.gas();
        car.tormoz();
      }
        int num=0;
   for (Car car:list){
       if (num<car.getMax_Gear()){
           num=car.getMax_Gear();
       }
   }
   for (Car car:list){
       if (num== car.getMax_Gear()){
           System.out.println("Автомобиль с найбольшой максимальной скоростью: "+car);
       }
   }







    }
}
