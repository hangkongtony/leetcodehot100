package com.penghk.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GroupAnagrams49 {


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> resMap = new ConcurrentHashMap<>();

        for (String str : strs) {
            char[] values = str.toCharArray();
            Arrays.sort(values);
            String key = new String(values);
            List<String> list = resMap.getOrDefault(key, new ArrayList<>());
            list.add(str);
            resMap.put(key, list);
        }

        return new ArrayList<>(resMap.values());

    }


}
