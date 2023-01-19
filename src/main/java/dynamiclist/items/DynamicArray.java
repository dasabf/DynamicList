package dynamiclist.items;

import dynamiclist.interfaces.DynamicList;


/**
 * The type Dynamic array.
 */
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
          int[] tempArray = new int[counter-1];
          for(int i=0;i<tempArray.length;i++)
              tempArray[i]=arr[i];
          arr=tempArray;
          counter--;
    }

    @Override
    public boolean isEmpty() {
        if(counter==0)
            return true;
        else
            return false;
    }
}
