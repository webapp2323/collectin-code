//package org.example;
//
//import java.util.*;
//
////Модульність: Код розділено на окремі класи (TimeArrayLinked, ArrayListOperations, LinkedListOperations),
//// що підвищує модульність та переносимість коду.
//public class TimeArrayLinked {
//    //Інкапсуляція: У коді використовуються окремі класи ArrayListOperations та LinkedListOperations,
//    // які інкапсулюють логіку роботи з відповідними структурами даних. Це дозволяє відокремити і
//    // приховати деталі реалізації від зовнішнього коду.
//    public static void main(String[] args) {
//        ArrayListOperations.testArrayList();
//        LinkedListOperations.testLinkedList();
//        SetOperationsWithInterfase.testHashSet();
//        SetOperationsWithInterfase.testLinkedHashSet();
//        SetOperationsWithInterfase.testTreeSet();
//    }
//}
////Абстракція: Класи ArrayListOperations та LinkedListOperations є абстракціями,
//// які надають високорівневі методи для тестування продуктивності ArrayList та LinkedList.
//// Ці абстракції ховають складність реалізації від коду, який їх використовує.
//
////Повторне використання коду: Створення окремих класів ArrayListOperations та LinkedListOperations
//// дозволяє повторно використовувати цей код в інших частинах програми, якщо буде потреба протестувати ефективність
//// інших структур даних.
//class ArrayListOperations {
//    public static void testArrayList() {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(i);
//        }
//
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.get(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken for ArrayList (for loop and get()) is: " + (end - start) + " ms");
//    }
//}
//
//class LinkedListOperations {
//    public static void testLinkedList() {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add(i);
//        }
//
//        // Method 1: Iterate using a regular for loop and get()
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < linkedList.size(); i++) {
//            linkedList.get(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken for LinkedList (for loop and get()): " + (end - start) + " ms");
//
//        // Method 2: Iterate using an Iterator
//        start = System.currentTimeMillis();
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            iterator.next();
//        }
//        end = System.currentTimeMillis();
//        System.out.println("Time taken for LinkedList (Iterator): " + (end - start) + " ms");
//
//        // Method 3: Iterate using a for-each loop
//        start = System.currentTimeMillis();
//        for (int x : linkedList) {
//            // Do nothing, just iterate
//        }
//        end = System.currentTimeMillis();
//        System.out.println("Time taken for LinkedList (for-each loop): " + (end - start) + " ms");
//    }
//}
//        class SetOperations {
//            public static void testHashSet() {
//                HashSet<Integer> hashSet = new HashSet<>();
//                for (int i = 0; i < 100000; i++) {
//                    hashSet.add(i);
//                }
//
//                long start = System.currentTimeMillis();
//                for (int i : hashSet) {
//                    // Do nothing, just iterate
//                }
//                long end = System.currentTimeMillis();
//                System.out.println("Time taken for HashSet (for-each loop): " + (end - start) + " ms");
//            }
//
//            public static void testLinkedHashSet() {
//                LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//                for (int i = 0; i < 100000; i++) {
//                    linkedHashSet.add(i);
//                }
//
//                long start = System.currentTimeMillis();
//                for (int i : linkedHashSet) {
//                    // Do nothing, just iterate
//                }
//                long end = System.currentTimeMillis();
//                System.out.println("Time taken for LinkedHashSet (for-each loop): " + (end - start) + " ms");
//            }
//
//            public static void testTreeSet() {
//                TreeSet<Integer> treeSet = new TreeSet<>();
//                for (int i = 0; i < 100000; i++) {
//                    treeSet.add(i);
//                }
//
//                long start = System.currentTimeMillis();
//                for (int i : treeSet) {
//                    // Do nothing, just iterate
//                }
//                long end = System.currentTimeMillis();
//                System.out.println("Time taken for TreeSet (for-each loop): " + (end - start) + " ms");
//            }
//        }
//
//
///*
//Time taken for ArrayList (for loop and get()) is: 1 ms
//Time taken for LinkedList (for loop and get()): 3866 ms
//Time taken for LinkedList (Iterator): 2 ms
//Time taken for LinkedList (for-each loop): 3 ms
// */