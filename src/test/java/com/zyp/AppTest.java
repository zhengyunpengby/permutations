package com.zyp;

import permutations.Permutation;
import permutations.PermutationStream;
import permutations.impl.ForeachPermutation;
import permutations.impl.IncreasePermutation;
import permutations.impl.InsertPermutation;
import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void insertPermutation() {
        Permutation insertPermutation = new InsertPermutation(5);
        Set<String> set = insertPermutation.generate();
        System.out.println("size:" + set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void foreachPermutation() {
        Permutation insertPermutation = new ForeachPermutation(5);
        Set<String> set = insertPermutation.generate();
        System.out.println("size:" + set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void increasePermutation() {
        PermutationStream insertPermutation = new IncreasePermutation(5);
        String tmp;
        int count = 0;
        while ((tmp = insertPermutation.generate()).length() > 0) {
            System.out.println(tmp);
            count++;
        }
        System.out.println(count);
    }

    @Test
    public void increasePermutation2() {
        PermutationStream insertPermutation = new IncreasePermutation(5);
        String tmp=insertPermutation.generate();
        int count = 1;
        while ((tmp = new IncreasePermutation(tmp).generate()).length() > 0) {
            System.out.println(tmp);
            count++;
        }
        System.out.println(count);
    }
}
