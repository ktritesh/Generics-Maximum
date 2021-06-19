package com.bridgelabz.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 101, int2 = 100, int3 = 99;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(101,max, "validating max method");
    }
}
