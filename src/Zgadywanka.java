
import java.util.Scanner;

public class Zgadywanka {
	private int liczba;
	
	
//	public void setLiczba(int liczba) {
//		this.liczba=liczba;
//	}
//	public int getLiczba() {
//		return liczba;
//	}

	public void zgaduj() {
		Scanner scan1=new Scanner(System.in);
		
		while(liczba<100 || liczba >200 || liczba%3!=0){
			System.out.println("Podaj odpowiednia liczbe");
			liczba=scan1.nextInt();
			if(liczba<100) System.out.println("Liczba za ma�a");
			else if(liczba>200) System.out.println("Liczba za du�a");
			else if(liczba%3!=0) System.out.println("Nie jest podzielna przez 3");
			else System.out.println("Wszystko ok");
		}
		
	}
	
}
