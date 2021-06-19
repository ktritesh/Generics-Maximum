package com.bridgelabz.generics;

public class Generics {

    public static void main(String[] args) {
        Integer [] int1 = {1,2,3};
        Double [] dub1 = {1.1, 1.2, 2.2, 3.3, 4.4};
        String [] str1 = {"Apple", "Peach", "Banana"};
        Generics.printInt(int1);
        Generics.printDouble(dub1);
        Generics.printStr(str1);
    }

    public static void printInt(Integer [] integers){
        for (int i : integers){
            System.out.println(i);
        }
    }

    public static void printDouble(Double [] doubles){
        for (double i : doubles){
            System.out.println(i);
        }
    }

    public static void printStr(String [] strings){
        for (String i : strings){
            System.out.println(i);
        }
    }
}
