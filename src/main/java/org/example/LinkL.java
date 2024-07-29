package org.example;

import java.util.LinkedList;
public class LinkL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        linkedList.remove(2);

        for (int i = 0; i < linkedList.size(); i++)
            System.out.print(linkedList.get(i) + " ");

        System.out.println();
            for (int x : linkedList)
                System.out.print(x + " ");
                System.out.println();
            }
        }


