
public class Calculator {

	int a=5;
	int b=2;
	
	public void add() {
		System.out.println("sum is:"+(a+b));
	}
	public void mul() {
		System.out.println("mul is:"+(a*b));
	}
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add();
	}

}
