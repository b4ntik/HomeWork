
public class Main {
    public static void main(String[] args) {
        //задание №1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        //задание №2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpper);
        //задание №3
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace ('ё', 'е');
        System.out.println(newFullName);
         }
    }



