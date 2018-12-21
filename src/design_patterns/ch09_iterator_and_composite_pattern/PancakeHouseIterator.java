package design_patterns.ch09_iterator_and_composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator
        implements Iterator {

    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem)items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

}