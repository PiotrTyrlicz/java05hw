
public class Wspolrzedne {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}

	Wspolrzedne(int x, int y){
		this.x=x;
		this.y=y;	
	}
	
	public void pokaz() {
	if(x>0 && y>0) {
		System.out.println("I �wiartka ");
	}
	else if(x<0 && y>0) {
		System.out.println("II �wiartka");
	}
	else if(x<0 && y<0) {
		System.out.println("III �wiartka");
	}
	else if(x>0 && y<0) {
		System.out.println("IV �wiartka");
	}
	else System.out.println("Co� posz�o nie tak");
	
	}
}
