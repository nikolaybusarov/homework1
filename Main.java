package com.company;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task1(25.36d, 52.36f);
        System.out.println(task2("15"));
        task3(77);
        task4(9);
        task5("java", "a");
        System.out.println(task6(585));
        task7(123658);
        System.out.println(task8("qwertyu"));
        task9(10.3f);
        task10(33, 14, 25);
        task11();

    }

    public static int task1(double c, float d) {   // Задача 1
        String z = String.valueOf(c + d);
        System.out.print("String is" + z);
        return 0;
    }

    public static String task2(String d) {    // Задача 2
        int result = Integer.parseInt(d);
        System.out.println(result);
        return d;
    }

    public static String task3(int c) {          // Задача 3
        System.out.print("число " + c + " ");
        if (c % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("не четное");
        }
        return null;
    }

    public static int task4(int d) {            // Задача 4
        int d1 = d % 10;
        if (d1 == 7) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        return d1;
    }

    public static void task5(String m, String n) {       // Задача 5
        if (m.contains(n)) {
            System.out.println("Строка содержит символ " + n);
        } else {
            System.out.println("Строка не содержит символ " + n);
        }
    }

    public static String task6(int hours) {         // Задача 6
        int minutes = hours * 60;
        int seconds = hours * 3600;
        String res = minutes + " минут " + seconds + " секунд";
        return res;
    }

    public static int task7(int seconds) {              // Задача 7
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;

        System.out.println("дней " + days + " часов " + hours + " минут " + minutes + " секунд " + sec);
        return seconds;
    }

    public static String task8(String f) {          // Задача 8
        char[] chars = f.toCharArray();
        String rez = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                f = "" + chars[i];
                rez = rez + f.toUpperCase();
            } else {
                f = "" + chars[i];
                rez = rez + f.toLowerCase();
            }
        }
        return rez;
    }

    public static Float task9(Float radius) {              // Задача 9
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длина окружности равна: " + circumference);
        return radius;
    }

    public static int task10(int radius, int y, int u) {      // Задача 10
        if (radius * radius >= (y * y + u * u) / 4)
            System.out.println("true ");
        else
            System.out.println("false");
        if (y > 0 || u > 0 || radius < 0) {
            System.out.println("Положительное значение");
        }
        return radius;
    }
    public static Date task11() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse("24/5/1985", formatter);


        Period p = Period.between(birthday, today);
        System.out.println("мне " + p.getYears() + " года, " + p.getMonths() +
                " месяца " + p.getDays() +
                " дней.");
        return null;
    }
}











