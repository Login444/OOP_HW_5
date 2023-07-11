package org.example.HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 3)Написать класс калькулятор, принимающий List целочисленных значений,
    // возвращающий сумму элементов коллекции (метод sum)
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNums = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            listInt.add(i);
            listDouble.add((double)i*1.1);
            listNums.add(i*1.2);
        }
        System.out.println("calc1.sum(listNums) = " + calc1.sum(listInt));
        System.out.println("calc1.sum(listNums) = " + calc1.sum(listDouble));
        System.out.println("calc1.sum(listNums) = " + calc1.sum(listNums));
        System.out.println();
        System.out.println("calc1.multi(listInt) = " + calc1.multi(listInt));
        System.out.println("calc1.multi(listDouble) = " + calc1.multi(listDouble));
        System.out.println("calc1.multi(listNums) = " + calc1.multi(listNums));
        System.out.println();
        System.out.println("calc1.div(listInt) = " + calc1.div(listInt));
        System.out.println("calc1.div(listDouble) = " + calc1.div(listDouble));
        System.out.println("calc1.div(listNums) = " + calc1.div(listNums));
        System.out.println("Binary listInt: ");
        calc1.convertBin(listInt);
        System.out.println("Binary listDouble: ");
        calc1.convertBin(listDouble);
        System.out.println("Binary listNums: ");
        calc1.convertBin(listNums);


    }
}
