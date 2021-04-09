package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
        * Kullanicidan bir cumle ve bir harf alin,
        * Cumlede harfin kac kere
        * kullanildigini bulup, yazdirin
        *
        * ORNEK:
        *
        * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
        *
        * OUTPUT : Girdiginiz cumlede �e� harfi 3 kere kullanilmis.
        */
		
		Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Girdiginiz cumlede aramak istediginiz harfi giriniz");
        char harf=scan.nextLine().toLowerCase().charAt(0);
        
        int count=0;
        for (int i = 0; i <=cumle.length()-1; i++) {
			if (cumle.charAt(i)==harf) {
				count++;
				
			}
			
			
		}
        System.out.println("Girdiginiz cumlede " + harf+ " harfi "+count +" kere kullanilmis");
        
scan.close();
	}

}
