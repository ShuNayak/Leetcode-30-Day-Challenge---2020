package com.ThirtyDayLeetChallenge.letsdotit;

import java.util.Stack;

public class Day9 {
	
	public static boolean compareStrings(String S, String T) {
		
		Stack<Character> sStack = new Stack<>();
		Stack<Character> tStack = new Stack<>();
		
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		
		for(char c:s) {
			if(c == '#' && !sStack.empty()) sStack.pop();
			else if(c != '#') sStack.push(c);
			
		}
		
		for(char c:t) {
			if(c == '#' && !tStack.empty()) tStack.pop();
			else if(c != '#') tStack.push(c);
		}
		
		return sStack.equals(tStack);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compareStrings("abc#", "abc#d#ef##"));
	}

}
