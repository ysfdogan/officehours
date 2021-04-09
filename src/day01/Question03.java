package day01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		/*
	     * Kullanicidan uc basamakli bir sayi alin
	     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
	     *
	     *
	     * Ornek : Inputs : 853
	     * Output : Girdiginiz sayinin birler basamagi : 3
	     *          Girdiginiz sayinin onlar basamagi : 5
	     *          Girdiginiz sayinin yuzler basamagi : 8
	     */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		if (sayi<100 ||sayi>999) {
			System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		} else {
			System.out.println("Girdiginiz sayinin birler basamagi : "+sayi%10);
			System.out.println("Girdiginiz sayinin birler basamagi : "+(sayi/10)%10);
			System.out.println("Girdiginiz sayinin birler basamagi : "+(sayi/100)%10);
		}
		
		
		scan.close();
		

	}

}
