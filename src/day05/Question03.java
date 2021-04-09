package day05;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {

		/*
		 * Bir String parametre kabul eden bir method yazin, String builder kullanarak o
		 * Stringi ters cevirin. Sonrasında girilen String palindrome mu degil mi
		 * kontrol eden java kodunu yaziniz Eg : input : I love Java Output: "Reversed
		 * sentence : avaJ evol I . It is not a palindrome"
		 */
		//NOT: StringBuilder'i kullanmamizin sebebi reverseyi kullanmak.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir string giriniz");
		String str = scan.next();
		
		String str2="";
		for (int i = str.length()-1; i >=0 ; i--) {
			str2+=str.charAt(i);
		}
		System.out.println(str2);

		if (str.equals(str2)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		scan.close();
	}

}
