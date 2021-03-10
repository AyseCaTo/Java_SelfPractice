package codingBat;

import java.text.CollationElementIterator;
import java.util.*;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(mapBully(map1));
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "candy");
        map1.put("d", "dirt");

        if (map1.containsKey("a") && map1.containsKey("b")){
            if (map1.get("a").equals(map1.get("b"))) {
                map1.remove("a");
                map1.remove("b");
            }
        }
        System.out.println(map1);

        String[] str = {"salt", "tea", "soda", "toast"};
        String[] str1 = {"a", "b", "a", "c", "a", "d", "a"};

        System.out.println(firstChar(str));
        System.out.println(wordAppend(str1));


    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream" , "cherry");
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {

        String temp1 = map.get("a");
        String temp2 = map.get("b");
        if (temp1 != null && temp2 != null && temp1.equals(temp2)) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        String temp = map.get("a");
        if (temp!=null){
            map.put("b", temp);
        }
        map.remove("c");
        return map;

    }

    public Map<String, String> topping2(Map<String, String> map) {

        String iceCream = map.get("ice cream");
        String spinach = map.get("spinach");

        if (iceCream!=null){
            map.put("yogurt", iceCream);
        }
        if (spinach!=null){
            map.replace("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        String a = map.get("a");
        String b = map.get("b");

        if (a!=null && b==null){
            map.put("b", a);
        }else if (a==null && b!=null){
            map.put("a", b);
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {

        String a = map.get("a");
        String b = map.get("b");

        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab", a+b);
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        String potato = map.get("potato");
        String salad = map.get("salad");

        if (potato!=null){
            map.put("fries", potato);
        }
        if (salad!=null){
            map.put("spinach", salad);
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {

        String a = map.get("a");
        String b = map.get("b");

        if (a!=null && b!=null){
            if (a.length()==b.length()){
                map.put("a", "");
                map.put("b", "");
            } else if (a.length()>b.length()){
                map.put("c",a);
            }else{
                map.put("c", b);
            }
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : strings){
            map.put(each, 0);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (String each : strings){
            list.add(each);
        }
        for (String each : list){
            map.put(each, Collections.frequency(list, each));
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (String each : strings){
            list.add(each);
        }
        for (String each : list){
            if (Collections.frequency(list, each)>1){
                map.put(each, true);
            }else {
                map.put(each, false);
            }

        }
        return map;

    }

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : strings){
            map.put(each, each.length());
        }
        return map;
    }

    public static Map<String, String> firstChar(String[] strings) {

        Map<String,String> map = new LinkedHashMap<>();
        for (String each : strings){
            String key = each.substring(0,1);
            if (map.containsKey(key)) {
                String value = map.get(key) + each;
                map.put(key, value);
            } else
                map.put(key, each);
        }
        return map;
    }

    public String[] allSwap(String[] strings) { //take a look, find better solution
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int p = map.get(c);
                map.remove(c);
                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                map.put(c,i);
            }
        }
        return result;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new TreeMap<>();
        for (String each : strings){
            map.put(each.substring(0,1), each.substring(each.length()-1));
        }
        return map;
    }



}
