package day01;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		/*Soru 4:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
	     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
	     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
	     * 3. Adim : Ekrana yazdiralim.				
	       	INPUT      : 41			
	        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
				
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("lutfen bir sayi giriniz");
		
			boolean k1= 3 >5;
			char k2='a';
			byte k3= 5;
			short k4=1234;
			int k5= 2468;
			long k6 =3346;
			float k7 =23.5f;
			double k8 =1234.5;
			
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		System.out.println(k5);
		System.out.println(k6);
		System.out.println(k7);
		System.out.println(k8);
scan.close();
	}

}
