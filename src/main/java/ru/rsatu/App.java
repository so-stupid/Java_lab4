package ru.rsatu;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {

        /**
         *  Все коварство кроется тут:
         *  CustomGeneric<String> goodGeneric = new CustomGeneric<>();
         */
        System.out.println("Вызываем методы с дженериками");
        CustomGeneric<String> goodGeneric = new CustomGeneric<>();
        List<Integer> listInt = Arrays.asList(1);
        List<String> listStr = Arrays.asList("first");
        goodGeneric.getList(listInt);
        goodGeneric.getList(listStr);
        System.out.println();

        System.out.println("А теперь пробуем вызов без дженерика");
        try {
            CustomGeneric badGeneric = new CustomGeneric();
            List<Integer> badIntList = Arrays.asList(2);
            List<String> badStrList = Arrays.asList("Second");
            badGeneric.getList(badIntList);
            badGeneric.getList(badStrList);
        } catch (ClassCastException e) {
            /**
             *  Несмотря на List<String> компилятор решает что get c Integer подходит лучше
             *  и поэтому мы видим ошибку.
             */
            System.err.println("Что и требовалось доказать!");
            System.err.println(e.getMessage());
        }
    }
}
