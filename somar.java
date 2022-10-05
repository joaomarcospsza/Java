package projeto.java;

import java.util.Scanner;

public class somar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, somar; //Declarando variaveis
		
		System.out.println("Informe os valores para soma respectivamente: ");
		x = ler.nextInt(); // Lendo as variaveis
		y = ler.nextInt();
		somar = x + y;
		
		System.out.println(somar);
	}
}
