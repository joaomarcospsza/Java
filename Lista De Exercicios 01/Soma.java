package lista_01;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b,somar;
		
		System.out.println("Informe o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Informe o segundo valor: ");
		b = ler.nextInt();
		
		somar = a + b;
		
		System.out.println("A soma de " + a + " + " + b + " fica: " + somar );
		
			 
	}
}
