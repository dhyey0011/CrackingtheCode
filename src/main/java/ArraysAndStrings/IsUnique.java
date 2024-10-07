package ArraysAndStrings;


import java.util.*;


//Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?
public class IsUnique{

    //using additional DS - Set
    public static boolean isUniqueString(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++) {
            if (set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }

    //without using a DS
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i= 0; i < str.length(); i++) {
            int val= str.charAt(i);
            if (char_set[val]) {//Already found this char in string
                return false;
                }
            char_set[val] = true;
            }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbcd";
        boolean b = isUniqueString(s);
        boolean bb = isUniqueChars(s);
        System.out.println("isUnique->>"+b+bb);
        s = "abcdefk";
        b = isUniqueString(s);
        bb = isUniqueChars(s);
        System.out.println("isUnique->>"+b+bb);
    }
}
