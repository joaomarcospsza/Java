package lista_01;

import java.util.Scanner;

//Fa�a um programa que pe�a tr�s n�meros e imprima o produto (multiplica��o) deles.

public class Produto_multiplicacao {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c, multi;
		
		System.out.println("Informe um valor: ");
		a = ler.nextInt();
		System.out.println("Informe outro valor: ");
		b = ler.nextInt();
		System.out.println("Informe o �ltimo valor: ");
		c = ler.nextInt();
		
		multi = (a * b) * c;
		
		System.out.println("A multiplica��o dos tr�s valores �: "+ multi);
	}
}
