package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
	/*Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
	 yaziniz. Kullanicilar deger girmek istemedigi zaman eklemeyi bitirin
	 */

		Scanner scan = new Scanner (System.in);
		List<String> arr= new ArrayList<>();
		
		do {
			System.out.println("Deger girmek istiyorsaniz E'ye, girmek istemiyorsaniz H'ye basiniz");
			char secim = scan.next().toUpperCase().charAt(0);
			
			if (secim=='E') {
				System.out.println("Lutfen bir string deger giriniz");
				arr.add(scan.next());
			}else if (secim=='H') {
				break;
			}else {
				System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
			}
		} while (true);
		
		System.out.println(arr);
		scan.close();
	}

}
