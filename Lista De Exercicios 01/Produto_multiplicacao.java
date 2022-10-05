package lista_01;

import java.util.Scanner;

//Faça um programa que peça três números e imprima o produto (multiplicação) deles.

public class Produto_multiplicacao {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c, multi;
		
		System.out.println("Informe um valor: ");
		a = ler.nextInt();
		System.out.println("Informe outro valor: ");
		b = ler.nextInt();
		System.out.println("Informe o último valor: ");
		c = ler.nextInt();
		
		multi = (a * b) * c;
		
		System.out.println("A multiplicação dos três valores é: "+ multi);
	}
}
