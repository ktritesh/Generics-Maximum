package com.bridgelabz.max;

public class MaxFinder {
    public static Integer findMax(Integer int1, Integer int2, Integer int3, Integer int4) {
        Integer max = int4;
        if(int1.compareTo(max)>0){
            max = int1;
        }
        if(int2.compareTo(max)>0){
            max=int2;
        }
        if(int3.compareTo(max)>0){
            max=int3;
        }
        System.out.printf("Max value of %s %s %s %s is : %s \n", int1,int2,int3,int4,max);
        return max;
    }

    public static Double findMax(Double dub1, Double dub2, Double dub3, Double dub4) {
        Double max = dub4;
        if(dub1.compareTo(max)>0){
            max = dub1;
        }
        if(dub2.compareTo(max)>0){
            max=dub2;
        }
        if(dub3.compareTo(max)>0){
            max=dub3;
        }
        System.out.printf("Max value of %s %s %s %s is : %s \n", dub1,dub2,dub3,dub4,max);
        return max;
    }

    public static String findMax(String str1, String str2, String str3, String str4) {
        String max = str4;
        if(str1.compareTo(max)>0){
            max = str1;
        }
        if(str2.compareTo(max)>0){
            max=str2;
        }
        if(str3.compareTo(max)>0){
            max=str3;
        }
        System.out.printf("Max value of %s %s %s %s is : %s \n", str1,str2,str3,str4,max);
        return max;
    }
}
