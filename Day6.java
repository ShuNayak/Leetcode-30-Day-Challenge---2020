package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day6 {

public List<List<String>> groupAnagrams(String[] strs) {

        
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String val:strs){
            char[] arr = val.toCharArray();
            Arrays.sort(arr);
            String data = new String(arr);
            if(map.containsKey(data)){
                map.get(data).add(val);
            }else{
                ArrayList<String> g = new ArrayList<>();
                g.add(val);
                map.put(data,g);
            }
        }
        
        List<List<String>> list = new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
