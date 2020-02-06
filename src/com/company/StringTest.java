package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        //Создать произвольные строки разными вариантами:
        //1) Литерал
        //2) new
        //3) массив символов
        //4) из байтов
        //5) С помощью StringBuilder

        String str = "First string";

        String str1 = new String("Second string");

        char[] chars = {'w', 'a', 'i', 't', ' ', 'm', 'e'};
        String str3 = new String(chars);

        String str4 = new String(str1.getBytes());

        StringBuilder builder = new StringBuilder("Builder string");
        String str5 = new String(builder);

        // Работа с строкой

        String fruit = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruits = fruit.split(",");
        System.out.println(Arrays.toString(fruits));
        String a = "";
        for (String s : fruits) {
            if (s.length() > a.length()) {
                a = s;
            }
        }
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0, 3));

        String new1 = " Я_новая_строка   ";
        String new2 = new1.trim();
        String new3 = new2.replace('_', ' ');
        System.out.println(new3);
        System.out.println();
        System.out.println("Введите Ваше сообщение");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Вы ввели: " + message);
        if (message.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        } else if (message.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
//        12 ???
//        else if (message.regionMatches(0,"ошибка",0,6)) {
//            System.out.println("Произошла ошибка");
//        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str + str1+str3 + "\n" + str4 + str5 + new1 + "\n" + new2 + new3 + message + "\n");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}