package Lesson_10.task2;

abstract class Car {
private int currentGear;
private int max_Gear;

 public Car(int currentGear, int max_Gear) {
  this.currentGear = currentGear;
  this.max_Gear = max_Gear;
 }

 public int getCurrentGear() {
  return currentGear;
 }

 public void setCurrentGear(int currentGear) {
  this.currentGear = currentGear;
 }

 public int getMax_Gear() {
  return max_Gear;
 }

 public void setMax_Gear(int max_Gear) {
  this.max_Gear = max_Gear;
 }

 abstract void gas();
 abstract void tormoz();
}
