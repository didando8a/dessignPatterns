package iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        boolean  hasNextElement = true;

        if (position >= items.length || items[position] == null) {
            hasNextElement = false;
        }

        return hasNextElement;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position++;

        return menuItem;
    }
}
