package com.bridgelabz.generics;

public class Generics {

    public static void main(String[] args) {
        Integer [] int1 = {1,2,3};
        printInt(int1);
    }

    public static void printInt(Integer [] integers){
        for (int i : integers){
            System.out.println(i);
        }
    }
}
