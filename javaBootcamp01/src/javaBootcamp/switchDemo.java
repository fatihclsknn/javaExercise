package javaBootcamp;

public class switchDemo {
	public static void main(String[] args) {
		char grade = 'F';
		switch (grade) {
		case 'A': 
			System.out.println("Mükkemmel geçtini");
			break;	
		case 'B': 
			System.out.println("çok güzel geçtini");
			break;	
		case 'C': 
			System.out.println("iyi geçtini");
			break;	
		case 'D': 
			System.out.println("fena değil");
			break;	
		case 'F': 
			System.out.println("kaldınız");
			break;	
		default:
			System.out.println("Geçersiz not girişi");
		}
	}
}
