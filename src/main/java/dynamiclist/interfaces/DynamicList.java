package dynamiclist.interfaces;

public interface DynamicList {
    void add(int item);
    int size();
    int set(int pos, int item);
    int get(int pos);
    void removeLast();
    boolean isEmpty();
}
