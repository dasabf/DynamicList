package dynamiclist.items;

import dynamiclist.interfaces.DynamicList;


public class DynamicArray implements DynamicList {
    private int DEFAULTSIZE = 5;
    private int[] arr = new int[5];
    private int counter=0;

    private void adjustSize(){
        int newSize = DEFAULTSIZE*2;
        int[] arrTemp = new int[newSize];
        for(int i=0;i<DEFAULTSIZE;i++){
            arrTemp[i]=arr[i];
        }
        arr = arrTemp;
    }

    @Override
    public void add(int item) {
        if(counter<DEFAULTSIZE){
            arr[counter] = item;
            counter++;
        }else{
            adjustSize();
            arr[counter] = item;
            counter++;
        }
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void set(int pos, int item) {

    }

    @Override
    public int get(int pos) {
        return 0;
    }

    @Override
    public void removeLast() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
