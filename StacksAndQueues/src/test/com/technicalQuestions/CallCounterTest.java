package com.technicalQuestions;

/**
ping(1), return 1 (1 call within the last 3 seconds)
ping(300), return 2 (2 calls within the last 3 seconds)
ping(3000), return 3 (3 calls within the last 3 seconds)
ping(3002), return 3 (3 calls within the last 3 seconds)
ping(7000), return 1 (1 call within the last 3 seconds)
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CallCounterTest {

    public CallCounter callCounter = new CallCounter();

    @Test
    public void CallCounterTest1() {
        assertEquals(1, (callCounter.ping(1)));
        assertEquals(2, (callCounter.ping(300)));
        assertEquals(3, (callCounter.ping(3000)));
        assertEquals(3, (callCounter.ping(3002)));
        assertEquals(1, (callCounter.ping(7000)));
    }

}
