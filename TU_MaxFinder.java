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
        Double dub1 = 5.5, dub2 = 4.4, dub3 = 3.3;
        Double max = MaxFinder.findMax(dub1, dub2, dub3);
        Assertions.assertEquals(5.5,max, "validating max method");
    }

}
