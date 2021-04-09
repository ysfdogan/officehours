package day03;

public class OgretmenBilgileri {

	String ogretmenIsmi; //bunlar degisken 
	String ogretmenBrans;

	public OgretmenBilgileri(String brans, String isim) { //bu constructors
		this.ogretmenBrans=brans;//kullanicidan ismi al bu class'in icindeki bransa koy
		this.ogretmenIsmi=isim; //this keyword'u bulundugumuz class'lar icin

	}
	
	public OgretmenBilgileri() {
		
	}
	
	
	
	
	public static void main(String[] args) {

		/*
		 * Class'i olusturun. Bu class'da bir ogretmen icin gerekli bilgileri
		 * girebilecegim Static Variable'lar olusturun ve main method icinde bu
		 * variable'lara deger atayin ve yazdirin
		 */

		OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("Fen","Velihan");
		System.out.println(ogretmen1.ogretmenBrans);
		
		OgretmenBilgileri ogretmen2 =new OgretmenBilgileri ();
		ogretmen2.ogretmenBrans = "Mat";
		ogretmen2.ogretmenIsmi = "Can";
		
		System.out.println(ogretmen2.ogretmenBrans+ogretmen2.ogretmenIsmi);
		

		
		
		
		
		
		
	}

}
