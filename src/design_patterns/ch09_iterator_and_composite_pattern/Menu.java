package design_patterns.ch09_iterator_and_composite_pattern;

import java.util.Iterator;

public interface Menu {

    public Iterator createIterator();
    public String getName();

}