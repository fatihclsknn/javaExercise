package javaBootcamp;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 13;
		int sayac = 0;
		if (number == 1)
		{
			System.out.println("Sayı asal değildir");
			return;
		}
		for (int i = 2; i < number; i++) {
			if(number % i == 0)
				sayac ++;
		}
		
		if(sayac != 0)
			System.out.println("girilen sayi asal değildir");
		else
			System.out.println("Girilen sayı asaldır.");

	}

}
