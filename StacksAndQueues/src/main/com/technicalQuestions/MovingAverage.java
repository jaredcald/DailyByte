package com.technicalQuestions;

import java.util.LinkedList;
import java.util.Queue;

/**
 Design a class, MovingAverage, which contains a method - next() - that is responsible for returning the moving average
 from a stream of integers.
 Note: a moving average is the average of a subset of data at a given point in time.

 Ex: Given the following series of events...

 // i.e. the moving average has a capacity of 3.
 MovingAverage movingAverage = new MovingAverage(3);
 m.next(3) returns 3 because (3 / 1) = 3
 m.next(5) returns 4 because (3 + 5) / 2 = 4
 m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
 m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
 */

public class MovingAverage {

    // TODO: declare any instance variables you require.
    /**
     * Initializes a MovingAverage with a
     * capacity of `size`.
     */

    Queue<Integer> queue;
    int total;
    int size;

    public MovingAverage(int size) {
        // TODO: initialize your MovingAverage.
        queue = new LinkedList<>();
        total = 0;
        this.size = size;
    }

    /**
     * Adds `val` to the stream of numbers
     * and returns the current average of the numbers.
     */
    public double next(int val) {
        // TODO: implement this method.
        if(queue.size() < size){
            queue.add(val);
            total += val;
        }
        else{
            total -= queue.peek();
            queue.remove();
            queue.add(val);
            total += val;
        }

        return (double)total / queue.size();
    }

}
