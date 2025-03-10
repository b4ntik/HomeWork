import java.util.Scanner;

public class Main {
//метод для проверки переданного года - високосный или нет
public static boolean leapYear(int year) {
    if (year > 1584) { //сразу проверяем, что год больше 1584, тогда едем дальше
        boolean checkYear;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //условие - год делится на 4, не делится на 100 и делится на 400
            checkYear = true;
            System.out.println(checkYear);
            return checkYear;
        } else {
            checkYear = false;
            System.out.println(checkYear);
            return checkYear;
        }
    }
    return false;
}


    public void main(String[] args) {
        //задание №1
        System.out.println("Введите год");//ввод года
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(leapYear(year));

    }

    }




