package org.example.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapFunctionTest {
    @Test

    public void sumNumber (){
        MapFunction mf = new MapFunction();
        assertEquals(3.5,mf.calculateAverage(3, 4), 0.001);
        assertEquals(0,mf.calculateAverage(0, 0), 0.001);
        assertEquals(-2.5,mf.calculateAverage(-5, 0), 0.001);
        assertEquals(100.5,mf.calculateAverage(201, 0), 0.001);

    }
}