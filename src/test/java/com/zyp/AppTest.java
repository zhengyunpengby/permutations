package com.zyp;

import permutations.Permutation;
import permutations.impl.ForeachPermutation;
import permutations.impl.InsertPermutation;
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
        Permutation insertPermutation = new InsertPermutation(5);
        Set<String> set = insertPermutation.generate();
        System.out.println("size:"+set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void foreachPermutation()
    {
        Permutation insertPermutation = new ForeachPermutation(5);
        Set<String> set = insertPermutation.generate();
        System.out.println("size:"+set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
