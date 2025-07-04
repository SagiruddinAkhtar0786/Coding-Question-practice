package com.practice.LeetCode.HashMap;
/*
 Given two strings ransomNote and magazine, return true if ransomNote can be 
 constructed by using the letters from magazine and false otherwise.
 Each letter in magazine can only be used once in ransomNote.
 */
import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomeNote = "aaba",magazine="aabad";
		
		Map<Character,Integer> count = new HashMap<>();
		
		for(char c : magazine.toCharArray())
			count.put(c, count.getOrDefault(c, 0)+1);
		
		for(char c : ransomeNote.toCharArray()) {
			if(!count.containsKey(c) || count.get(c) == 0) {
				System.out.println(" word can not be prepard");
				return ;
			}
			
			count.put(c, count.get(c)-1);
			
		}
		System.out.println("yes word prepared");

	}

}

/*
 // second way
 
 class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int arr[] = new int[26];

        for(int i = 0 ; i<magazine.length() ; i++){
            char ch = magazine.charAt(i);
            arr[ch-'a']++;
        }
        for(int i = 0; i <ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            arr[ch-'a']--;
            if(arr[ch-'a'] < 0)
                return false;
        }
        return true;
        
    }
}
 
 * */

