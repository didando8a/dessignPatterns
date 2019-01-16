package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements IteratorMenuInterface {
    ArrayList<MenuItem> items;
    Iterator<MenuItem> iterator;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
        this.iterator = this.items.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Object next() {
        return iterator.next();
    }
}
