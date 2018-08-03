package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    private int[] backed;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        int i=0;        //current element index
        int value;      //current value
        public boolean hasNext() {
            return i <= backed.length - 1;
        }

        public Integer next() {

            if(!hasNext()) {
                throw new IllegalStateException("No such element");
            }
            else {
                value=backed[i];
                i++;
                return value;
            }
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
