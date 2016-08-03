package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;


    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
		private int index=0;
		
        public boolean hasNext() {
            //TODO: You task is implement this method
            if (backed!=null && backed.length>index) {
                return true;
            } else {
                return false;
            }
        }

        public Integer next() {
            //TODO: You task is implement this method
			return (Integer) backed[index++];
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
