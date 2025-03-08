import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //задание №1
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        Double[] arrayDouble = {1.57, 7.654, 9.986};
        String[] arrayString = new String[5];

        //задание №2
        String str = Arrays.toString(array);//прописываю массив чисел в строку
        System.out.println(str.replaceAll("[\\[\\]]", "")); //вывожу строку, очищенную от квадратных скобок
        str = Arrays.toString(arrayDouble);//прописываю массив чисел c запятой в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));//очищаю от квадратных скобок
        str = Arrays.toString(arrayString);//прописываю массив строк в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));//очищаю от квадратных скобок

        //задание №3
        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());//сортирую в обатном порядке
        str = Arrays.toString(array);//прописываю массив в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));//чищу от скобок
        Arrays.sort(arrayDouble);
        Arrays.sort(arrayDouble, Collections.reverseOrder());//сортирую в обратном порядке
        str = Arrays.toString(arrayDouble);//прописываю массив чисел в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));
        Arrays.sort(array);//сортирую массив обратно в нормальном порядке
        //задание №4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { //добавляю условие проверки четности. если нечетное то
                array[i] = array[i] + 1; //прибавить 1
            }
        }
        str = Arrays.toString(array);//прописываю массив чисел в строку
        System.out.println(str.replaceAll("[\\[\\]]", ""));
    }
}


