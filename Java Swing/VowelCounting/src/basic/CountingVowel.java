package basic;

import java.util.Scanner;

public class CountingVowel {

	int count =0;
	char character;

	Scanner input = new Scanner(System.in);
	String sentence = input.next();
	
	public CountingVowel() {
		countVowel();
	}
	public void countVowel() {
		
		for(int i=0; i<sentence.length(); i++) {
			character =sentence.charAt(i);
			
			if(character =='a' || character =='e' || character =='i' || character =='o' || character =='u' || character ==' ') {
				count++; // count = count+1;
			}
			
		}
		System.out.println("Number of vowels in the given sentence : "+count);
	
	
}
}
