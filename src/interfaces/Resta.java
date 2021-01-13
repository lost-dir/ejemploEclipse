package interfaces;

public class Resta implements interfazA {

	@Override
	public int operacion(int a, int b) {
		int resta = a - b;
		return resta;
	}

}
