package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private int min;
    private int max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int difference = max - min;
                int returnOfNumber = random.nextInt(difference + 1);
                returnOfNumber += min;
                return returnOfNumber;
            }
        };
    }

    //...
}
