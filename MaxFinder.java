package com.bridgelabz.max;

public class MaxFinder {
    public static Integer findMax(Integer int1, Integer int2, Integer int3) {
        Integer max = int3;
        if(int1.compareTo(max)>0){
            max = int1;
        }
        if(int2.compareTo(max)>0){
            max=int2;
        }
        System.out.printf("Max value of %s %s %s is : %s \n", int1,int2,int3,max);
        return max;
    }
}
