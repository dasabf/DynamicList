package dynamiclist.items;

import dynamiclist.interfaces.DynamicList;


/**
 * The type Dynamic array.
 */
public class DynamicArray implements DynamicList {
    private static final int DEFAULTSIZE = 5;
    private int currentSize = DEFAULTSIZE;
    private int[] arr = new int[5];
    private int counter=0;

    private void adjustSize(){
        int newSize = currentSize*2;
        int[] arrTemp = new int[newSize];
        for(int i=0;i<DEFAULTSIZE;i++){
            arrTemp[i]=arr[i];
        }
        arr = arrTemp;
        currentSize = newSize;
    }

    @Override
    public void add(int item) {
        if(counter<DEFAULTSIZE){
            arr[counter] = item;
            counter++;
        } else if (counter<currentSize) {
            arr[counter] = item;
            counter++;
        } else{
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
    public int set(int pos, int item) {
        if(pos<0 || pos>=counter){
            return -1;
        }else{
            arr[pos]=item;
            return 1;
        }
    }

    @Override
    public int get(int pos) {
        int res=0;
        try{
            res = arr[pos];
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public void removeLast() {
          int[] tempArray = new int[currentSize];
          counter--;
          for(int i=0;i<counter;i++)
              tempArray[i]=arr[i];
          arr=tempArray;
    }

    @Override
    public boolean isEmpty() {
        if(counter==0)
            return true;
        else
            return false;
    }

    /**
     * Pop item int.
     *
     * @param item the item
     * @return the int
     */
    public int popItem(int item){
        int pos=0;
        for(int i=0;i<currentSize;i++){
            if(arr[i]==item){
                pos=i;
                break;
            }
        }
        int[] arr1 = new int[currentSize];
        for(int i=0;i<pos;i++){
             arr1[i]=arr[i];
        }
        for(int i=pos;i<arr1.length-1;i++){
            arr1[i]=arr[i+1];
        }
        arr = arr1;
        counter--;
        return pos;
    }


}
