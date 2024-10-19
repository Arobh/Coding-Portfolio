import java.util.* ;
import java.io.*; 
import java.util.*;
/****
 * Following is the java Pair class
 * class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }
}
 */


public class Solution {

    public static ArrayList<Pair> duplicate_char(String s, int n) {
        
        // Write your Code here
        int arr[]=new int[128];
        for(char c: s.toCharArray()){
            arr[c-'A']++;
        }
        ArrayList<Pair> ans=new ArrayList<>();
        for(int i=0;i<128;i++){
            if(arr[i]>1){
                char c=(char)('A'+i);
                Pair p=new Pair(c,arr[i]);
                ans.add(p);
            }
        }
        return ans;
    }
}
