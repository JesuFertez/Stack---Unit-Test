package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    public static final int MAX_SIZE = 5;
    private final List<Integer> listInt = new ArrayList<>();

    public Stack() {
    }

    public boolean push(int a) {
        if (listInt.size() >= MAX_SIZE) {
            System.out.println("It's full");
            return false;
        }
        for (int i = 0; i < listInt.size(); i++) {
            if (a == listInt.get(i)) {
                return false;
            }
        }
        return listInt.add(a);
    }

    public int size() {
        return listInt.size();
    }

    public void pop() {
        if (listInt.isEmpty()) {
            System.out.println("It's empty");
           throw new IndexOutOfBoundsException(
                   "You can't get something out if there's nothing there");
        } else {
            listInt.remove(listInt.size() - 1);
        }
    }

    public int peek() {
        return listInt.get(listInt.size() - 1);
    }
}
