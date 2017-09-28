
import java.util.Scanner;

public class Imiona {
	
	public void powitanie() {
		String[] imiona = new String[5];
		Scanner scan1=new Scanner(System.in);
		System.out.println("Podaj 5 imion");
		for (int i=0; i<imiona.length; i++) {
			imiona[i]=scan1.nextLine();
		}
		
		for (int i=imiona.length-1; i>=0; i--) {
			System.out.println("Witaj "+imiona[i]);
		}
	}
}
