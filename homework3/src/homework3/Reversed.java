package homework3;

import java.util.Scanner;

public class Reversed {
	public static void main(String args[]) {
		String original= " ";
		String reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Ters çevirilecek kelimeyi  girin");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1 ; i >= 0 ; i--)
		  reverse = reverse + original.charAt(i);

		System.out.println("Stringin tersi: " + reverse);
		
		 if (original.equals(reverse))
		      System.out.println("Palindrom.");
		    else
		      System.out.println("Palindrom değil.");
		}
		
	}



