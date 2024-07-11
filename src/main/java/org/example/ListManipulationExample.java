package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ListManipulationExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Object[] elementsToAdd = {1, 10, 113, 5, "hello", "world"};
        System.out.println("| Операція | Елемент | Результат |");
        System.out.println("| -------- | ------- | -------- |");
        for (Object element : elementsToAdd) {
            ListManipulator.addElements(list, element);
            System.out.println("| Додано | " + element + " | Успіх |");
        }

        SearchUtils.printList(list);

        Object[] containedElements = {113, "goodbye", "hello"};

        for (Object element : containedElements) {
            boolean contains = SearchUtils.containsWithIterator(list, element);
            System.out.println("| Пошук | " + element + " | " + contains + " |");
        }

        Object[] elementsToDell = {"hello", "world"};
        for (Object element : elementsToDell) {
            ListManipulator.removeElement(list, element);
            System.out.println("| Видалення | " + element + " | Успіх |");
        }
        SearchUtils.printList(list);
    }
}

class ListManipulator {
    public static void addElements(ArrayList<Object> list, Object element) {
        list.add(element);
    }

    public static void removeElement(ArrayList<Object> list, Object element) {
        int index = list.indexOf(element);
        if (index != -1) {
            list.remove(index);
        }
    }
}

class SearchUtils {
    public static boolean containsWithIterator(ArrayList<Object> list, Object element) {
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void printList(ArrayList<Object> list) {
        System.out.println("| Вміст колекції list | - | " + list + " |");
    }
}