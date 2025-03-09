import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //задание №1
        int[] payment = {123, 256, 112, 999, 456};
        int sum = 0;
        for (int element : payment) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //задание №2
        int min = Arrays.stream(payment).min().getAsInt();
        int max = Arrays.stream(payment).max().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Макимальная сумма трат за неделю составила " + max + " рублей");
        //задание №3
        double averagePayment;
        averagePayment = sum / payment.length;//чтобы не создавать лишние сущности, использую сумму трат из первого задания
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");
        //задание №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         for (int i = reverseFullName.length-1; i >= 0 ; i--){
             System.out.print(reverseFullName[i]);

         }
    }
}


