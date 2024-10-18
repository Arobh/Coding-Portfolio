//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        // code here
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))    return 0;
        }
        return 1;
    }
};
