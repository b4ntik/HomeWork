import java.time.LocalDate;
import java.util.Scanner;

public class LeapYearChecker {
    //метод для проверки переданного года - високосный или нет
    public static boolean leapYear(int year) {
        if (year > 1584) { //сразу проверяем, что год больше 1584, тогда едем дальше
            boolean checkYear;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //условие - год делится на 4, не делится на 100 и делится на 400
                checkYear = true;
                return checkYear;
            } else {
                checkYear = false;
                return checkYear;
            }
        }
        return false;
    }

    //public class NeedVersionApplication {
        public static String needUpdate(int osType, int yearOfManufacture) {
            int currentYear = LocalDate.now().getYear();
            String text = "";
            if (osType == 0 && yearOfManufacture == currentYear) {
                text = " обычная версия для iOs ";
                return text;
            } else if (osType == 0 && yearOfManufacture < currentYear) {
                text = " облегченная версия для iOs";
                return text;
            } else if (osType == 1 && yearOfManufacture == currentYear) {
                text = " обычная версия для Android";
                return text;
            } else if (osType == 1 && yearOfManufacture < currentYear) {
                text = " облегченная версия для Android";
                return text;
            }
            return text;
        }


        public static void main(String[] args) {
            //задание №1
            System.out.println("Введите год");//ввод года
            Scanner in = new Scanner(System.in);
            int year = in.nextInt();
            if (leapYear(year)) {
                System.out.println("Год " + year + " является високосным");
            } else {
                System.out.println("Год " + year + " не является високосным");

            }
            //задание №2
            in = new Scanner(System.in);//ввод операционной системы из консоли
            int clientDeviceYear;
            byte clientOS = 0;
            System.out.println("Введите операционную систему вашего телефона буквами (iOS или Android)"); // вводим тип ОС
            String os = in.nextLine().toLowerCase();//привожу вводимые значения к нижнему регситру для простоты
            boolean containsIos = os.contains("ios");//равна true если в строке есть ios
            boolean containsDroid = os.contains("android");//равна true если в строке есть android\
            System.out.println("Введите год выпуска телефона"); // вводим год выпуска
            clientDeviceYear = in.nextInt();
            if (containsIos) {
                clientOS = 0;
            } else if (containsDroid) {
                clientOS = 1;
            }
            System.out.println("Вам нужна " + needUpdate(clientOS, clientDeviceYear));
        }
    }





