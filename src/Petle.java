
//zadanie3
public class Petle {
	
	public void pokaz() {
		double x=0;
		System.out.println("I część zadania");
		while(x<=3) {
			System.out.println(x);
			x=x+0.1;
			
			x=x*10;
			x=Math.round(x);
			x=x/10;
			
		}
		System.out.println("\nII część zadania");
		x=0;
		do{
			System.out.println(x);
			x=x+0.1;
		}while(x<=3);
		
		
	}
}
