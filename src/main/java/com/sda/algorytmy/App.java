package com.sda.algorytmy;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, String> map = new HashMap<>();
        //Map<Integer, List<String>> map1 = new HashMap<>();
        map.put(1, "Ryan");
        map.put(2, "Rune");
        map.put(3, "Bart");
        System.out.println(map);

        for (Map.Entry<Integer, String> m: map.entrySet())
        {
            System.out.println("Key: " + m.getKey());
            System.out.println("Value of: "+m.getKey()+": "+ m.getValue());
        }
        Map<String, List<String>> food = new HashMap<>();
        List<String> vegan = new ArrayList<>();
        vegan.add("JAJKA");
        vegan.add("SER");
        vegan.add("TOFU");

        List<String> halal = new ArrayList<>();
        halal.add("BARAN");
        halal.add("KURCZAK");
        halal.add("SALAMI");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("MARCHEWKA");
        koszerne.add("CIASTKA");
        koszerne.add("HUMUS");

        food.put("WEGAN", vegan);
        food.put("HALAL", halal);
        food.put("KOSZERNE", koszerne);
        System.out.println(food);

        for(Map.Entry<String, List<String>> m: food.entrySet())
        {
            System.out.println(m.getKey());
            System.out.println(food.get(m.getKey()));
            List<String> values = food.get(m.getKey());
            for (String val: values)
            {
                System.out.println("-"+val);
            }
        }
    }
}
