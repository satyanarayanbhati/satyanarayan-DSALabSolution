package com.greatlearning.main;

import java.util.ArrayList;

import com.greatlearning.main.LongestPath.Node;

public class LongestPath {

	static class Node {
		int data;
		Node left, right;
		
		public Node( int data ) {
			this.data = data;
			left = right = null;
		}
	}
	
	private static ArrayList getLongestPath( Node root ) {
		
		if( root == null ) {
			return new ArrayList();
		}
		
		ArrayList L = getLongestPath( root.left );
		ArrayList R = getLongestPath( root.right );
		
		
		if( L.size() > R.size() ) {
			L.add( root.data );
			return L;
		} else {
			R.add( root.data );
			return R;
		}
	}
	
	public static void main( String[] args ) {
		Node root = new Node( 10 );
		root.left = new Node( 20 );
		root.right = new Node( 30 );
		root.left.left = new Node( 40 );
		root.left.right = new Node( 50 );
		root.right.left = new Node( 60 );
		root.right.right = new Node( 70 );
		root.left.left.left = new Node( 80 );
		root.left.left.right = new Node( 90 );
		root.left.right.left = new Node( 100 );
		root.left.right.right = new Node( 110 );
		root.left.left.left.left = new Node( 120 );
		
		ArrayList longestPath = getLongestPath( root );
		System.out.println( longestPath.size() );
		
		for( int i = longestPath.size() - 1; i >= 0; i-- ) {
			System.out.print( longestPath.get( i ) + "  " );
		}
	}
}
