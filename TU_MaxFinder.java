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
}
