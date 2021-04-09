package day05;

import java.util.Scanner;

public class Question031 {
	/*
	 * Bir String parametre kabul eden bir method yazin, String builder kullanarak o
	 * Stringi ters cevirin. Sonrasında girilen String palindrome mu degil mi
	 * kontrol eden java kodunu yaziniz Eg : input : I love Java Output: "Reversed
	 * sentence : avaJ evol I . It is not a palindrome"
	 */
//	NOT: StringBuilder'i kullanmamizin sebebi reverseyi kullanmak.
//	ONEMLI: Eger method'umuzun return type void isie method icerisinde bir deger return
//	edmeyiz. Fakat methodumuzun return type'i void'den farkli bir return type ise
//	bir return keyword'u olmak zorunda. Return type'i voidden farkli bir method syso() kullanamaz diye
//	bir kural soz konusu bile olamaz. Return edilicek deger'de method'un return type'i ile ayni veri
//	tipinde olmak zorundadir.
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println(isPalindrome(scan.nextLine()));
		scan.close();
	}
	
	
	public static boolean isPalindrome(String word) {
		boolean flag = false;
		
		StringBuilder wordSb = new StringBuilder(word);
		wordSb.reverse();
		System.out.println(wordSb+" "+word);
		
		if (wordSb.toString().equals(word)) {//tostring yapmamizin sebebi StringBuilder
									//olan wordSb yi stringe cevirelim ki equals yazabilelim
			flag = true ;
		} 
		return flag;
	}


}
