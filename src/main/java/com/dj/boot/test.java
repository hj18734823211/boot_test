package com.dj.boot;


import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        String str = "hello dianit";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if(map.get(aChar) == null){
                map.put(aChar, 1);
            }else {
                map.put(aChar, map.get(aChar)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-------------" + entry.getValue());
        }
    }
}
