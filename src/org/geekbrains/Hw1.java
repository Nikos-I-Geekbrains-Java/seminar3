package org.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {

    public void CheckSolving(String equation) {

        char[] arrayChar = equation.replaceAll("\\s+", "").toCharArray();
        List<Integer> arrayIndexes = new ArrayList<>();

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '?') {
                arrayIndexes.add(i);
            }
        }

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '+') {
                arrayChar[i] = '=';
            }
        }

        List<List<Integer>> variables = new Hw1().combine(arrayIndexes.size(), arrayChar, arrayIndexes);
        if (variables.toArray().length == 0) {
            System.out.println("Решение отсутствует");
        }
    }

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int k, char[] CharArr, List<Integer> signIndexes) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), k, CharArr, signIndexes);

        return ans;
    }

    public void helper(List<Integer> comb, int k, char[] charArr, List<Integer> signIndexes) {
        if (comb.size() == k) {
            checkS(comb, charArr, signIndexes);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k, charArr, signIndexes);
            comb.remove(comb.size() - 1);
        }
    }

    private void checkS(List<Integer> comb, char[] charArray, List<Integer> signIndexes) {
        for (int i = 0; i < signIndexes.size(); i++) {
            charArray[signIndexes.get(i)] = Character.forDigit(comb.get(i), 10);
        }

        String[] equationPart = String.valueOf(charArray).split("=");
        int a = Integer.parseInt(equationPart[0]);
        int b = Integer.parseInt(equationPart[1]);
        int c = Integer.parseInt(equationPart[2]);
        if (a + b == c) {
            ans.add(new ArrayList<>(comb));
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }
}

