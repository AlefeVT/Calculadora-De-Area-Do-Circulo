import java.util.Scanner;

public class CalculadoraAreaCirculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		
		double raio = scanner.nextDouble();
		double area = Math.PI * (raio * raio);
		
		System.out.println("A area do circulo é: " + area);

	}

}
