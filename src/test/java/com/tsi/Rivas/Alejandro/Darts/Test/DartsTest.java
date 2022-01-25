package com.tsi.Rivas.Alejandro.Darts.Test;

import com.tsi.Rivas.Alejandro.Darts.Darts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DartsTest {
    @Test
    void setWeightTest() {
        Darts testDarts = new Darts();
        testDarts.setWeight(20);
        assertEquals(testDarts.getWeight(),20,"Weight should be 20. Error in set weight code block");
    }
    @Test
    void setLengthTest() {
        Darts testDarts2 = new Darts();
        testDarts2.setLength(15);
        assertEquals(testDarts2.getLength(),15,"Length should be 15. Error in set length code block");
    }
// hghjhdf
}
