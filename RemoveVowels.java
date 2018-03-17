import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a string ");
		String input = scanner.nextLine();
		String replacestring = input.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after replacing vowels " + replacestring);	
		scanner.close();
	}

}
