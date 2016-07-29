package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;
    Integer currentElement = 0;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        public boolean hasNext() {
            if(currentElement == backed.length) {return false;}
            else{ return true; }
        }

        public Integer next() {
            if(hasNext()){currentElement++; return backed[currentElement-1];}
            else {return null;}
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
