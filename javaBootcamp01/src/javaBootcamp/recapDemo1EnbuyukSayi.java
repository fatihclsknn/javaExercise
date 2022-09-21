package javaBootcamp;

public class recapDemo1EnbuyukSayi {

	public static void main(String[] args) {
		int sayi1 = 12;
		int sayi2 = 10;
		int sayi3 = 3;
		int enBuyuk = sayi1;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayi="+enBuyuk);

	}

}
