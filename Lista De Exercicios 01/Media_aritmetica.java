package lista_01;

import java.util.Scanner;

public class Media_aritmetica {
	public static void main(String[] args) {
		//Fa�a um programa que pe�a as 4 notas bimestrais e mostre a m�dia aritm�tica.
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d, soma, media;
		
		System.out.println("Informe as quatro notas respectivamente: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		System.out.println("Notas registradas...");
		
		soma = a + b + c + d;
		media = soma/4;
		
		System.out.println("A media das notas foi: " + media);
	}
}
