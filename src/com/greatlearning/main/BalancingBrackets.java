package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {
	private static boolean isBalanced( String bracketExpression ) {
		Stack stack = new Stack();
		
		 for( int i = 0; i < bracketExpression.length(); i++ ) {
			Character c = bracketExpression.charAt( i );
			
			
			if( c == '{' || c == '[' || c == '(' ) {
				stack.push( c );
			} else { 
				
				if( stack.isEmpty() ) {
					return false;
				}
		
				
				Character d = (Character) stack.pop();
						
				
				if( c == '}' && d != '{' || c == ']' && d != '[' || c == ')' && d != '(' ) {
					return false;
				}
			}
		}
		
				return stack.isEmpty();
	}
	
	public static void main( String[] args ) {
		String bracketExpression = "([[{}]])";
		
		if( isBalanced( bracketExpression ) ) {
			System.out.println( "Balanced" );
		} else {
			System.out.println( "Not Balanced" );
		}
	}
}