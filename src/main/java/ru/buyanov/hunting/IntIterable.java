package ru.buyanov.hunting;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;

    private int mIndex = 0;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        public static final String ARRAY_END_REACHED = "Reached the end of array";

        public boolean hasNext() {
            return mIndex < backed.length;
        }

        public Integer next() {
            if (hasNext())
                return backed[mIndex++];
            else
                throw new NoSuchElementException(ARRAY_END_REACHED);
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
