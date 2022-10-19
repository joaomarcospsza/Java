package lista_01;

import java.util.Scanner;

public class bascara {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b,c, delta, x1,x2;
		int cont = 0;
		
		System.out.println("Informe o Valor de 'A, B, C' respectivamente: ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		if (a == 0)
		    System.out.println("Estes valores não formam uma equação de segundo grau; ");
		    else { 
				delta = (b * b) - ( 4 * a * c);
				if (delta < 0)
				 System.out.println("Não existe raiz real ");
				if (delta == 0) { 
				System.out.println("Existe uma raiz real");
				x1 = (- b) / (2 * a);
		                    String x1Format = String.valueOf(x1);
		                    if (x1Format.contains("0.5")){ 
		                    x1Format = "1/2";
		                    System.out.println("Raiz = "+x1Format);
		                    }
				 }if (delta > 0) { 
				System.out.println("Existem duas raízes reais");
				x1 = (- b + Math.sqrt(delta))/(2 * a);
				x2 = (- b - Math.sqrt(delta))/( 2 * a);
				System.out.println("Primeira raiz = " + x1);
				System.out.println("Segunda raiz = " + x2);
				 }
		}
	}
} 
