package org.example;

import java.util.*;

public class SetOperationsWithInterfase {
//Абстракция: Интерфейс DataStructureOperations предоставляет абстрактное определение поведения, которое должны реализовывать конкретные классы, такие как HashSetOperations, LinkedHashSetOperations и т.д. Это позволяет отделить спецификацию от реализации.
    public interface DataStructureOperations {
        //Полиморфизм: Реализация методов test() в каждом из классов, реализующих интерфейс DataStructureOperations, демонстрирует полиморфизм. Метод test() в разных классах имеет одинаковую сигнатуру, но реализует различное поведение в зависимости от конкретного типа данных, с которым работает.
        void test();
    }

    //Инкапсуляция: Класс SetOperationsWithInterfase имеет внутренние классы HashSetOperations, LinkedHashSetOperations, TreeSetOperations, ArrayListOperations и LinkedListOperations, которые реализуют интерфейс DataStructureOperations. Эти внутренние классы инкапсулируют свои данные и поведение.
    public static class HashSetOperations implements DataStructureOperations {
        public void test() {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < 100000; i++) {
                hashSet.add(i);
            }

            long start = System.currentTimeMillis();
            for (int i : hashSet) {
                // Do nothing, just iterate
            }
            long end = System.currentTimeMillis();
            System.out.println("Time taken for HashSet (for-each loop): " + (end - start) + " ms");
        }
    }

    //Кроме того, в этом коде используются такие структуры данных, как HashSet, LinkedHashSet, TreeSet, ArrayList и LinkedList, которые также являются примерами применения принципов ООП в Java, а именно:
    //
    //Инкапсуляция: Эти структуры данных инкапсулируют свои внутренние данные и операции.
    //Абстракция: Они предоставляют абстрактные интерфейсы для работы с коллекциями, скрывая детали реализации.
    //Наследование: Некоторые из этих структур данных (например, LinkedList) наследуют функциональность от базовых классов.
    //Полиморфизм: Методы, предоставляемые этими структурами данных, можно использовать в полиморфном контексте, так как они реализуют общие интерфейсы.
    //Таким образом, в этом коде демонстрируется применение основных принципов ООП, таких как инкапсуляция, абстракция, наследование и полиморфизм.
    public static class LinkedHashSetOperations implements DataStructureOperations {
        public void test() {
            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
            for (int i = 0; i < 100000; i++) {
                linkedHashSet.add(i);
            }

            long start = System.currentTimeMillis();
            for (int i : linkedHashSet) {
                // Do nothing, just iterate
            }
            long end = System.currentTimeMillis();
            System.out.println("Time taken for LinkedHashSet (for-each loop): " + (end - start) + " ms");
        }
    }

    public static class TreeSetOperations implements DataStructureOperations {
        public void test() {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < 100000; i++) {
                treeSet.add(i);
            }

            long start = System.currentTimeMillis();
            for (int i : treeSet) {
                // Do nothing, just iterate
            }
            long end = System.currentTimeMillis();
            System.out.println("Time taken for TreeSet (for-each loop): " + (end - start) + " ms");
        }
    }

    public static class ArrayListOperations implements DataStructureOperations {
        public void test() {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 100000; i++) {
                arrayList.add(i);
            }

            long start = System.currentTimeMillis();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i);
            }
            long end = System.currentTimeMillis();
            System.out.println("Time taken for ArrayList (for loop and get()): " + (end - start) + " ms");
        }
    }

    public static class LinkedListOperations implements DataStructureOperations {
        public void test() {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 100000; i++) {
                linkedList.add(i);
            }

            // Method 1: Iterate using a regular for loop and get()
            long start = System.currentTimeMillis();
            for (int i = 0; i < linkedList.size(); i++) {
                linkedList.get(i);
            }
            long end = System.currentTimeMillis();
            System.out.println("Time taken for LinkedList (for loop and get()): " + (end - start) + " ms");

            // Method 2: Iterate using an Iterator
            start = System.currentTimeMillis();
            Iterator<Integer> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for LinkedList (Iterator): " + (end - start) + " ms");

            // Method 3: Iterate using a for-each loop
            start = System.currentTimeMillis();
            for (int x : linkedList) {
                // Do nothing, just iterate
            }
            end = System.currentTimeMillis();
            System.out.println("Time taken for LinkedList (for-each loop): " + (end - start) + " ms");
        }
    }

    public static void main(String[] args) {
        DataStructureOperations[] operations = {
            new HashSetOperations(),
            new LinkedHashSetOperations(),
            new TreeSetOperations(),
            new ArrayListOperations(),
            new LinkedListOperations()
        };

        for (DataStructureOperations op : operations) {
            op.test();
        }
    }
}