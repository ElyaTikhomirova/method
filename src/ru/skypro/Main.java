package ru.skypro;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void year(int yearNumber) {
        //Задание 1
        if (((yearNumber % 4 == 0) && (yearNumber % 100 != 0)) || (yearNumber % 400 == 0)) {
            System.out.println(yearNumber + " - високосный год");
        } else {
            System.out.println(yearNumber + " - не високосный год");

        }
    }

    //Задание 2
    public static int app(int clientiOS, int clientDeviceYear) {
        if (clientiOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientiOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS");
        }
        if (clientiOS != 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (clientiOS != 1 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию для Android");
        }
        return clientiOS;
    }

    // Задание 3
    public static int delivery(int distance) {
        int timeDelivery = 1;
        int timeDelivery2 = timeDelivery + 1;
        int timeDelivery3 = timeDelivery2 + 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней " + timeDelivery);
        }
        if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней " + timeDelivery2);
        }
        if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней " + timeDelivery3);
        }
        return distance;
    }

    // Задание 4
    public static void removeDuplicate (String letters) {
        char[] myArray = letters.toCharArray();
        for(int i=0; i<letters.length(); i++){
            for (int j=i+1; j<letters.length(); j++){
                if(myArray[i] == myArray[j]){
                        System.out.println("Найден дубль: " + myArray[i]);
                        break;
                    }

                }
                }
            }

    //Задание 5
    public static void numbers(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {

        // Задание 1

        year(2000);
        year(2003);

        //Задание 2


        app(1, 2014);
        app(0, 2017);
        app(1, 2022);

        // Задание 3
        delivery(40);
        delivery(90);
        delivery(100);
        delivery(19);

        // Задание 4
        String letters = "aabccddefgghiijjkk";
        removeDuplicate(letters);





        // Задание 5
        System.out.println();
        int[] arr = {3, 2, 1, 6, 5};
        numbers(arr);



            }
        }

















