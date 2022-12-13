package org.geekbrains;

import java.util.ArrayList;

public class Hw3 {
    public ArrayList<Integer> minMax(ArrayList<Integer> srcArray) {
        ArrayList<Integer> outArray = new ArrayList<>();
        Integer min = srcArray.get(0);
        Integer max = srcArray.get(0);
        for (Integer intVal : srcArray) {
            if (intVal < min) min = intVal;
            else if (intVal > max) max = intVal;
        }
        outArray.add(min);
        outArray.add(max);
        return outArray;
    }
}
