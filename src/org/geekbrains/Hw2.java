package org.geekbrains;

import java.util.List;

public class Hw2 {
    public List<Integer> RemoveVal(List<Integer> srcList, boolean delOdd){ //deOdd: true - нечетные false - четные
        List<Integer> dstList = null;
        List<Integer> tmpList = null;

        for (Integer val : srcList)
            if (val%2 ==0){
                tmpList.add(val);
            }
        if (delOdd){

        }

        return dstList;
    }

}
