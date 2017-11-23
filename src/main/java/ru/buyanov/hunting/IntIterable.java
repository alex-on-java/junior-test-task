package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;
    private final int length;


    public IntIterable(int[] backed) {
        this.backed = backed;
        length = backed.length;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

         private int counter = 0;

        public boolean hasNext() {
            //TODO: You task is implement this method

            if(counter < length){
                return true;
            }
            else {
                return false;
            }
        }

        public Integer next() {
            //TODO: You task is implement this method
            if(counter < length){
                return backed[counter++];
            }
            else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
