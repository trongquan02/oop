package lab10.MyList;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        this.elements = new Object[INITIAL_SIZE];
        this.size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    public void enlarge() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public void add(Object o, int index) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        if (index > size) {
            elements[size++] = o;
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size] = null;
        --size;
    }

}
