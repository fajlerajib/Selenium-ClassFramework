package com.account.homework;

public class SentenceSplit {

	public static void main(String[] args) {
		String sentence = "Smart Tech IT Solution";
		
		/** String a [] = sentence.split(" ");
		System.out.println("Sentence lentgh of array : " +a.length);
		
		
		for (String i:a) {
			System.out.println(i);
			
		}
      
      **/
		
		for (int i=0; i<sentence.length(); i++) {
			
			if (sentence.charAt(i) == 'T' || sentence.charAt(i)== 't'){
					
					System.out.println(sentence.charAt(i));
			}
		}
	}

}
