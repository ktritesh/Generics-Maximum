package com.bridgelabz.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 77, int2 = 88, int3 = 99, int4 = 111;
        Integer max = MaxFinder.findMax(int1, int2, int3, int4);
        Assertions.assertEquals(111,max, "validating max method");
    }

    @Test
    void whenDoubleShouldReturnMax() {
        Double dub1 = 77.7, dub2 = 88.8, dub3 = 99.9, dub4 = 111.1;
        Double max = MaxFinder.findMax(dub1, dub2, dub3, dub4);
        Assertions.assertEquals(111.1,max, "validating max method");
    }
    @Test
    void whenStringShouldReturnMax() {
        String str1 = "Apple", str2 = "Banana", str3 = "Peach", str4 = "Orange";
        String max = MaxFinder.findMax(str1, str2, str3, str4);
        Assertions.assertEquals("Peach",max, "validating max method");
    }
}
