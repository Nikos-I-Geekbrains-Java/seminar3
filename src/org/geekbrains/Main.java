package org.geekbrains;

import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

// ДЗ2 - Дан массив целых чисел (List<Integer) удалить из него целые числа.
        ArrayList<Integer> srcList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> dstList = new ArrayList<>();
        Random random = new Random();
        Hw2 rv = new Hw2();

        for (int i = 0; i < 20; i++) {
            srcList.add(random.nextInt(50));
        }

        System.out.printf("Исходный: %s\n", srcList);
        dstList = rv.removeVal(srcList);
        System.out.printf("Четные: %s\n", dstList.get(0));
        System.out.printf("Нечетные: %s\n", dstList.get(1));
    }
}
