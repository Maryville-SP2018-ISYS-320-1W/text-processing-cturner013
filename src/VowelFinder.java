import java.util.Scanner;

public class VowelFinder {
	public static void main(String[] aras) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int vowelCount = 0;
		int count = 0;
		while(count < str.length()) {
			if("a".equalsIgnoreCase(" "+str.charAt(count)) ||
					"e".equalsIgnoreCase(" "+str.charAt(count)) ||
					"i".equalsIgnoreCase(" "+str.charAt(count)) ||
					"o".equalsIgnoreCase(" "+str.charAt(count)) ||
					"u".equalsIgnoreCase(" "+str.charAt(count)) ) {
				vowelCount++;
				
			}
		count++;
		}
	System.out.println("Total number of vowel is "+vowelCount);
	}
	


}
