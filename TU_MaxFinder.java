package com.bridgelabz.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer int1 = 111, int2 = 222, int3 = 333;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(333,max, "validating max method");
    }
}
