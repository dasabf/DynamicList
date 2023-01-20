package dynamiclist.testarray;

import dynamiclist.items.DynamicArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArray {
    @Test(priority = 0)
    public void testaddition(){
        DynamicArray d = new DynamicArray();
        d.add(5);
        d.add(6);
        d.add(7);
        Assert.assertEquals(d.size(), 3);
    }
    @Test(priority = 1)
    public void adjustSizeandAdd(){
        DynamicArray d = new DynamicArray();
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(8);
        d.add(8);
        d.add(8);
        d.add(8);
        Assert.assertEquals(d.size(), 8);
    }
    @Test(priority=2)
    public void deleteTest(){
        DynamicArray d = new DynamicArray();
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(8);
        d.add(8);
        d.add(8);
        d.add(8);
        Assert.assertEquals(d.size(), 8);
        for(int i=0;i<d.size();i++)
            System.out.print(d.get(i)+" ");
        d.removeLast();
        System.out.println();
        Assert.assertEquals(d.size(), 7);
        for(int i=0;i<d.size();i++)
            System.out.print(d.get(i)+" ");
    }
    @Test(priority = 3)
    public void deleteItem(){
        DynamicArray d = new DynamicArray();
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(8);
        d.add(8);
        d.add(11);
        d.add(9);
        Assert.assertEquals(d.size(), 8,"The actual size after addition is :: "+d.size()
                +" The expected size after addition is :: 8");
        d.popItem(11);
        Assert.assertEquals(d.size(), 7, "The actual size after addition is :: "+d.size()
                +" The expected size after addition is :: 7");
    }

}
