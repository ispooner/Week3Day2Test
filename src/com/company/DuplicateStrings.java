package com.company;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class DuplicateStrings {

    public void findDuplicateStrings(List<String> strings) {
        Hashtable<String, Integer> strCount = new Hashtable<>();
        for(String str : strings) {
            Integer count = strCount.get(str);
            if(count != null) {
                count++;
                strCount.put(str, count);
            }
            else {
                count = 1;
                strCount.put(str, count);
            }
        }

        Set<String> strSet = strCount.keySet();
        for(String str : strSet) {
            Integer count = strCount.get(str);
            if(count > 1) {
                System.out.println(str);
            }
        }
    }
}
