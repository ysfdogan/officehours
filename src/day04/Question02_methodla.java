package day04;

public class Question02_methodla {

	public static void main(String[] args) {
		
		/*
	     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
	     *
	     * input[]= {1,2,3,4,5,6,7}
	     * Output : 4
	     */
		
		int arr[]= {1,2,3,4,5,6,7,5};
		
		System.out.println(ortalamaBul(arr));

	}
	public static double ortalamaBul(int arr[]) {
		double ortalama= 0;
		double toplam=0;
		
		for(int each: arr) {
			toplam+=each;
		}
		ortalama=toplam/arr.length;
		
		return ortalama;
		
	}

}
