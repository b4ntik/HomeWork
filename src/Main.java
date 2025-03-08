import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задание №1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        String[] arrayString = new String[5];

        //задание №2
        String str = Arrays.toString(array);//прописываю массив чисел в строку
        System.out.println(str.replaceAll("[\\[\\]]", "")); //вывожу строку, очищенную от квадратных скобок
        str = Arrays.toString(arrayDouble);//прописываю массив чисел c запятой в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));//очищаю от квадратных скобок
        str = Arrays.toString(arrayString);//прописываю массив строк в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));//очищаю от квадратных скобок
    }
        //задание №3
        reverseArray(array);
        //использую метод для разворачивания массива задом наперед
        public static void reverseArray(int[] arr) {
            int temp;
            for (int i = 0; i < arr.length / 2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }


        }

