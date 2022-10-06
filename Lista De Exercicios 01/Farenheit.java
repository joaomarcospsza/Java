package lista_01;

import java.util.Scanner;

public class Farenheit {
	public static void calcular_Farenheit(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double farenheit, celsius;
		
		System.out.println("Informe a temperatura em Farenheit: ");
		farenheit = ler.nextDouble();
		
		celsius = 5 * (farenheit - 32) / 9;
		
		System.out.println("A temperatura em Farenheit " + farenheit + " ficara " + celsius + " em Celsius." );
	}
}
