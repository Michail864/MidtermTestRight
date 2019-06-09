package string.problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram ana = new Anagram();
        ana.areAnagram("army", "mary");
        if(areAnagram("army", "mary")){
            System.out.println("Are anagram");
        }
    }


    public static boolean areAnagram (String str1, String str2){

        Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        for (int i=0; i<arr1.length; i++){
            if(hmap1.get(arr1[i])==null){
                hmap1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        for (int j=0; j<arr2.length; j++){
            if (hmap2.get(arr2[j])==null){
                hmap2.put(arr2[j], 1);
            }
            else {
                Integer d = (int)hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }
        if(hmap1.equals(hmap2)){
            return true;
        }
        return false;
    }
}
