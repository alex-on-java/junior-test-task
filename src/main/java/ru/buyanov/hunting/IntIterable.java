package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;
    int current = 0;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        public boolean hasNext() {
            if (backed.length == 0) return false;
            if (current <= (backed.length-1)) return true;
            else return false;
        }

        public Integer next() {
            if (hasNext()){
                int next = current;
                current++;
                return Integer.valueOf(backed[next]);
            }
            else return null;
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
