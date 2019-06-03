package com.zyp;

import com.zyp.permutations.impl.InsertPermutation;
import org.junit.Test;

import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void insertPermutation()
    {
        InsertPermutation insertPermutation = new InsertPermutation(5);
        Set<String> set = insertPermutation.generate();
        System.out.println("size:"+set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
