package basic;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		System.out.println("Please enter your sentence :"+ "\n");
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		String sentence;
		Scanner userTakeInput = new Scanner(System.in);
		sentence =userTakeInput.nextLine();
		sentence.toLowerCase();
		
        for(int i = 0; i < sentence.length(); ++i)
        {
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
            	++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
            	++digits;
            }
            else if (ch ==' ')
            {
            	++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }

}
