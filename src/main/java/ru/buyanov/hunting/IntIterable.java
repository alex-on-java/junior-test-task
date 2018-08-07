package ru.buyanov.hunting;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
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

        public boolean hasNext() {
            return i < backed.length;
        }

        public Integer next() {

            if(!hasNext()) {
                throw new IllegalStateException("No such element");
            }
            else {
                return backed[i++];
            }

        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
