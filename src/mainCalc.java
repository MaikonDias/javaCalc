import java.util.Scanner;
import services.Divide;
import services.Multi;
import services.Sub;
import services.Sum;

public class mainCalc {
	public static void main(String[]args) {
		Sum Sum = new Sum();
		Sub Sub = new Sub();
		Multi Multi = new Multi();
		Divide Divide = new Divide();
		
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		String op;
		
		System.out.print("insira o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.print("\ninsira o segundo numero: ");
		n2 = sc.nextDouble();
		System.out.print("\ninsira a opera��o: \n");
		System.out.println("+ : Soma \n- : Subtra��o \n* : Multiplica��o \n/ : Divis�o");
		op = sc.next();
		sc.close();
		
			switch(op) {
				case "+": System.out.printf("O resultado da soma � %.2f: ", Sum.calculate(n1,n2)); break;
				case "-": System.out.printf("O resultado da subtra��o � %.2f: ", Sub.calculate(n1,n2));break;
				case "*": System.out.printf("O resultado da multiplica��o � %.2f: ", Multi.calculate(n1,n2)); break;
				case "/": System.out.printf("O resultado da divis�o � %.2f: ", Divide.calculate(n1,n2)); break;
				default: System.out.println("opera��o inv�lida"); System.exit(0); break;
		}
	}
	
}

