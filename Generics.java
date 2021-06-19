package com.bridgelabz.generics;

public class Generics {

    public static void main(String[] args) {
        Integer [] int1 = {1,2,3,4};
        Double [] dub1 = {1.1, 1.2, 2.2, 3.3, 4.4};
        String [] str1 = {"Apple", "Peach", "Banana", "Orange"};
        Generics.printArray(int1);
        Generics.printArray(dub1);
        Generics.printArray(str1);
    }

    public static <E> void printArray(E[] elements){
        for (E i : elements){
            System.out.println(i);
        }
    }
}
