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
}