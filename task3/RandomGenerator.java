package Lesson_10.task3;

import java.util.Random;

public class RandomGenerator implements IntGenerator{
    @Override
    public int getInt() {
        Random rnd=new Random();
        int number= rnd.nextInt(9)+1;
        return number;
    }
}
