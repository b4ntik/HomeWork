import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //задание №1
        int[] payment={123,256,112,999,456};
        int sum = 0;
        for (int element : payment){
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}


