package com.technicalQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * // i.e. the moving average has a capacity of 3.
 * MovingAverage movingAverage = new MovingAverage(3);
 * m.next(3) returns 3 because (3 / 1) = 3
 * m.next(5) returns 4 because (3 + 5) / 2 = 4
 * m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
 * m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
 */

public class MovingAverageTest {

    @Test
    public void MovingAverageTest1() {
        MovingAverage movingAverage = new MovingAverage(3);

        assertEquals(3, (movingAverage.next(3)));
        assertEquals(4, (movingAverage.next(5)));
        assertEquals(5, (movingAverage.next(7)));
        assertEquals(6, (movingAverage.next(6)));
    }
}
