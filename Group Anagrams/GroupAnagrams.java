import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char str[] = s.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
    return new LinkedList<>(map.values());
    }
    }