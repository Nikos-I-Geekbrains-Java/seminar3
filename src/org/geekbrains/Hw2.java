package org.geekbrains;

import java.util.ArrayList;

public class Hw2 {
    public ArrayList<ArrayList<Integer>> removeVal(ArrayList<Integer> srcList) {
        ArrayList<ArrayList<Integer>> dstList = new ArrayList<>();
        ArrayList<Integer> tmpList = new ArrayList<>();

        for (Integer val : srcList) {
            if (val % 2 == 0) {
                tmpList.add(val);
            }
        }
        dstList.add(tmpList);           // Четные
        srcList.removeAll(tmpList);
        dstList.add(srcList);           // Нечетные
        return dstList;
    }
}
