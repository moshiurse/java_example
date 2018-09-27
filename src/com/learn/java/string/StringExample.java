package com.learn.java.string;

/**
 * 
 * @author Moshiur Rahman
 * @String
 * String Class uses character array to store text.
 * Java uses UTF-16 for characters.
 * String is sequence of unicode characters.
 * String is immutable.
 *
 */

public class StringExample {

	public static void main(String[] args) {

		String empty = new String();
		String hello = new String("Hello This is Moshiur!");
		
		char[] ch = {'M', 'O', 'S', 'H', 'I', 'U', 'R'};
		String chString = new String(ch);
		String s = "Hello Moshiur";
		
//		System.out.println("Empty: "+empty);
		System.out.println(hello);
//		System.out.println(chString);
		System.out.println(s);
		
		System.out.println("s.length(): "+ s.length());
		System.out.println("s.isEmpty(): "+ s.isEmpty());
		System.out.println("s.equals() : "+ s.equals("HELLO"));
		System.out.println("s.equalsIgnoreCase() : "+ s.equalsIgnoreCase("HELLO"));
		System.out.println("s.compareTo() : " + s.compareTo("HELLO"));
		
		System.out.println("s.contaians() : "+ s.contains("HELLO"));
		System.out.println("s.contaians() : "+ s.contains("hello"));
		System.out.println("s.startsWith() : "+ s.startsWith("HELLO"));
		System.out.println("s.startsWith() : "+ s.startsWith("hello"));
		System.out.println("s.endsWith() : "+ s.endsWith("moshiur"));
		System.out.println("s.endsWith() : "+ s.endsWith("Moshiur"));
		System.out.println("s.lastIndexOf() : "+ s.lastIndexOf("llo"));
		System.out.println("s.indexOf() : "+ s.indexOf("llo"));
		
		System.out.println("s.charAt(5) : "+ s.charAt(5));
		System.out.println("s.substring() : "+ s.substring(5));
		System.out.println("s.substring() : "+ s.substring(3,6));

		System.out.println("s.toUpperCase() : "+ s.toUpperCase());
		System.out.println("s.toLowerCase() : "+ s.toLowerCase());
		System.out.println("s.trim() : "+ s.trim());
		
		System.out.println("s.trim() : "+ s.replaceAll("l", "m"));
		System.out.println("s.trim() : "+ s.trim());
		
		System.out.println("s.split('o\') ");
		String[] sp = s.split("o");
		for(String temp : sp){
			System.out.println(temp);
		}
		
		
		
		
		
		
		

	}

}
