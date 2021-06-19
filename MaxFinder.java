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

    public static Double findMax(Double dub1, Double dub2, Double dub3) {
        Double max = dub2;
        if(dub1.compareTo(max)>0){
            max = dub1;
        }
        if(dub3.compareTo(max)>0){
            max=dub3;
        }
        System.out.printf("Max value of %s %s %s is : %s \n", dub1,dub2,dub3,max);
        return max;
    }
}
