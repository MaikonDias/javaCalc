package services;

public class Divide {
	public double calculate(double n1, double n2) {
		if(n2 == 0) {
			throw new ArithmeticException("n�o � possivel dividir por zero");
		}
		return (n1/n2);
	}
}
