package day04;

import java.util.ArrayList;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		/*
		 * Bir array'da aranilan sayinin olup olmadigini kontrol eden bir method yazin
		 */

		Scanner scan = new Scanner (System.in);
				System.out.println("Aramak istediginiz bir  sayi giriniz");
		int arananSayi = scan.nextInt();
		
		int arr[] =new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
			
		}
		
		System.out.println(sayiKontrol(arr,arananSayi));
		//String arrToStr = Arrays.toString(arr);
		//System.out.println(arrToStr);
		//System.out.println(Arrays.toString(arr)); ustteki iki satirla bu satir ayni isi yaptigi icin kisa yolu tercih edeiz
		scan.close();
	}
	
	public static boolean sayiKontrol(int arr[],int sayi) {
		
		boolean flag= false;
		
		ArrayList<Integer> arrList = new ArrayList <>();
		
		for (int each : arr) {
			arrList.add(each);
		}
		if (arrList.contains(sayi)) {
			return true;
		}
		
		return flag;
		
	}
	

}
