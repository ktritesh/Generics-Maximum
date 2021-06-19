package com.bridgelabz.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 77, int2 = 88, int3 = 99;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(99,max, "validating max method");
    }

    @Test
    void whenDoubleShouldReturnMax() {
        Double dub1 = 77.7, dub2 = 88.8, dub3 = 99.9;
        Double max = MaxFinder.findMax(dub1, dub2, dub3);
        Assertions.assertEquals(99.9,max, "validating max method");
    }
    @Test
    void whenStringShouldReturnMax() {
        String str1 = "Apple", str2 = "Banana", str3 = "Peach";
        String max = MaxFinder.findMax(str1, str2, str3);
        Assertions.assertEquals("Peach",max, "validating max method");
    }
}
