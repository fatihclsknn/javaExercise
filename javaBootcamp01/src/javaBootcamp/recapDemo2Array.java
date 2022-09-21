package javaBootcamp;

public class recapDemo2Array {

	public static void main(String[] args) {
		double myList[] = {1.9,2.4,1.7};
		double total = 0;
		double max = myList[0];
		for(double number:myList)
		{
			if(max < number)
			{
				max = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Toplam="+ total);
		System.out.println("En büyük sayi="+ max);
	}

}
