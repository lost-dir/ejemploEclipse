package interfaces;

public class Multiplicacion implements interfazA {

	@Override
	public int operacion(int a, int b) {
		int multi = a * b;
		return multi;
	}

}
