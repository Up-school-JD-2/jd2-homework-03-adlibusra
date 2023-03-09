package homework3;

import java.util.Random;
import java.util.Scanner;

public class Tahmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	     Scanner sc = new Scanner(System.in);
				System.out.print("Tahmini saynızı  girin");
				int sayi=sc.nextInt();
				
		// double num = Math.random();
	       // int myRandInt = (int)(num*100);
	       int number = (int) (Math.random() * 100) + 1;

	        System.out.println("Random number between 1 and 100: "+number);
	      int counter=0; 
	 while ( number != sayi) {
		   counter ++;
		   if(number>sayi) {
			   System.out.println("Tahmin ettiğiniz sayıdan daha büyük");
		   }else {
			   System.out.println("Tahmin ettiğiniz sayıdan daha küçük");
		   }
	   System.out.print("Yanlış tahmin tekrar sayı girin ");
	   sayi=sc.nextInt();  		   
	 }
	 
	 System.out.println("Doğru Tahmin " + number );
	 System.out.println("Tahmin Sayısı " +  counter);
	 
	        	

			
			
			
			
		
	}

}
