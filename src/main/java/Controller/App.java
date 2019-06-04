package Controller;

import com.alibaba.fastjson.JSON;
import permutations.Permutation;
import permutations.PermutationType;
import permutations.impl.ForeachPermutation;
import permutations.impl.InsertPermutation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Permutation permutation = new InsertPermutation(3);
        Map<String,Object> data = new HashMap<>();
        Set<String> set = permutation.generate();
        data.put("count",set.size());
        data.put("data",set);
        JSON.toJSONString(data);

        /*Permutation permutation = new ForeachPermutation(3);
        Map<String,Object> data = new HashMap<>();
        Set<String> set = permutation.generate();
        data.put("count",set.size());
        data.put("data",set);
        data.put("type", PermutationType.FOREACH.getName());
        JSON.toJSONString(data);*/
    }
}
