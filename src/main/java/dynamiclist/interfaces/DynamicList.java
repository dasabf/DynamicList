package dynamiclist.interfaces;

public interface DynamicList {
    void add(int item);
    int size();
    void set(int pos, int item);
    int get(int pos);
    void removeLast();
    boolean isEmpty();
}
