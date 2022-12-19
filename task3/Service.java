package Lesson_10.task3;

public class Service {
   private IntGenerator intGenerator;

    public Service(IntGenerator intGenerator) {
        this.intGenerator = intGenerator;
    }
    public int readInt(){
        return intGenerator.getInt(); //генерирует число за счет реализации из конструктора
    }
}

