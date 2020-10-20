package com.technicalQuestions;

/**
Create a class CallCounter that tracks the number of calls a client has made within the last 3 seconds.
Your class should contain one method, ping(int t) that receives the current timestamp (in milliseconds)
of a new call being made and returns the number of calls made within the last 3 seconds.

Note: you may assume that the time associated with each subsequent call to ping is strictly increasing.
// MEANING - it should be considered that the ping being sent is the GLOBAL time

Ex: Given the following calls to ping…

ping(1), return 1 (1 call within the last 3 seconds)
ping(300), return 2 (2 calls within the last 3 seconds)
ping(3000), return 3 (3 calls within the last 3 seconds)
ping(3002), return 3 (3 calls within the last 3 seconds)
ping(7000), return 1 (1 call within the last 3 seconds)

Pseudocode:
    Given int time (milliseconds)
    Return int (num times called)
    Utilizing a Queue
    Add the current ping to the list
    While the first item in the queue is less then the current ping - 3000 (3 seconds ago)
        remove the first item in the queue
    Return the size of the Queue

 */

import java.util.LinkedList;
import java.util.Queue;

public class CallCounter {
    Queue<Integer> queue;

    public CallCounter() {
        // a Queue is an interface of a linked list
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        return queue.size();
    }
}
