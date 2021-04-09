package day01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) { //ctrl + shift + p duzenleme
		
		/*
		 * Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
		 * ekrana yazdiran java kodunu yaziniz.
		 * INPUT : Y
		 * 	OUTPUT : YES
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen Y/N ikilisinden birini giriniz");
		char input=scan.next().charAt(0);
		
		if (input=='Y'||input=='y') {
			System.out.println("YES");
		} else if (input=='N'||input=='n') {
			System.out.println("NO");
		} else {
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
		
		}
	
		scan.close();
	}

}
