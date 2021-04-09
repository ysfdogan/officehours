package day04;

public class Question02 {

	public static void main(String[] args) {
		
		/*
	     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
	     *
	     * input[]= {1,2,3,4,5,6,7}
	     * Output : 4
	     */
		
		int arr[]= {1,2,3,4,5,6,7,5};
		
		double toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println(toplam/arr.length);
	}

}
