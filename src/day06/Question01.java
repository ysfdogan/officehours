package day06;

import java.util.Scanner;

public class Question01 {
	/*
	 * / Q #1) replace() methodu kullanmadan bir String'deki bosluklari kaldiran 
	 * Java kodunu yaziniz.
	 * input : Te  cc h pro Educati   on'in Full Sta ck Kurslari baslamisti           r
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bosluklardan arindirmak istediginiz bir stringi giriniz");
		withOutSpaces(scan.nextLine());
		
		scan.close();
		}
	public static String withOutSpaces(String word) {
		String wordWithOutSpaces = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)!=' ') {
				wordWithOutSpaces+=word.charAt(i);
			}
		}
		System.out.println(wordWithOutSpaces);
		return wordWithOutSpaces;
	}
	
	
	
	

	}


