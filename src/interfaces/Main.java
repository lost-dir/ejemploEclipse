package interfaces;

public class Main {

	public static void main(String[] args) {
		Suma suma = new Suma();
		Resta resta = new Resta();
		Multiplicacion multi = new Multiplicacion();
		Division divi = new Division();
		
		System.out.println(suma.operacion(5, 5));
		System.out.println(resta.operacion(5, 5));
		System.out.println(multi.operacion(5, 5));
		System.out.println(divi.operacion(5,5));
	}
}
