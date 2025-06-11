import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 2024;
        task1(year);

        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        task2(clientOS, clientDeviceYear);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        task3(deliveryDistance);

    }

    public static void task1(int year) {

            if (year < 1584) {
                    System.out.println("В то время високосный год ещё не придумали.");
                }else if ((year %4 == 0 && year %100 !=0)||year %400 == 0){
                    System.out.println(year + " - високосный год");
                }else System.out.println(year + " - невисокосный год");
        }

    public static void task2(int clientOS, int clientDeviceYear) {

        if (clientOS != 0 && clientOS != 1) {
            throw new RuntimeException("Неизвестная ОС");
        }else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3(int deliveryDistance) {

        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }else {System.out.println("Вне зоны доставки.");}
    }
}