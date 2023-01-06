package lab10.MyList;

public interface MyList {
    void add(Object o);

    void add(Object o, int index);

    Object get(int index);

    int size();

    void remove(int index);
}
