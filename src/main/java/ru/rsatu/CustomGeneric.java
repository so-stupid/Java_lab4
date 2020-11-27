package ru.rsatu;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *  Класс дженерик необходимый по заданию.
 */
public class CustomGeneric<T> {

    /**
     *  Метод дженерик необходимый по заданию.
     */
    public <E> void getList(Collection<E> collection) {
        for (E element : collection) {
            System.out.println(element);
        }
    }

    /**
     *  Указан четкий тип Integer для наглядности
     *
     */
    public void getList(List<Integer> collection) {
        for (Integer element : collection) {
            System.out.println(element);
        }
    }

}
