package org.geekbrains;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

// ДЗ1 - Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
        String srcStr = " 2? + ?5 = 6?";
        Hw1 ex = new Hw1();
        ex.CheckSolving(srcStr);

// ДЗ2 - Дан массив целых чисел (List<Integer) удалить из него целые числа.
        ArrayList<Integer> srcList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> dstList = new ArrayList<>();
        Random random = new Random();
        Hw2 rv = new Hw2();

        for (int i = 0; i < 20; i++) {
            srcList.add(random.nextInt( -10, 10));
        }
        System.out.print("\n");
        System.out.printf("Исходный: %s\n", srcList);
        dstList = rv.removeVal(srcList);
        System.out.printf("Четные: %s\n", dstList.get(0));
        System.out.printf("Нечетные: %s\n", dstList.get(1));


//ДЗ3 - Дан массив целых чисел (List<Integer>) найти минимальное, максимальное значения в этом массиве.
//    ArrayList<Integer> srcList = new ArrayList<>();
    ArrayList<Integer> outMinMax = new ArrayList<>();
        Hw3 mm = new Hw3();

        System.out.print("\n");
        System.out.printf("Исходный: %s\n", srcList);
        outMinMax = mm.minMax(srcList);
        System.out.printf("Мин: %s, Макс: %s\n", outMinMax.get(0), outMinMax.get(1));

    }
}

