package projeto.java;

import java.util.Scanner;

public class Par_impar {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		
		System.out.println("Informe um n�mero inteiro: ");
		x = ler.nextInt();
		
		if(x >= 0) {
			if((x % 2)== 0) {
				System.out.println("O n�mero " + x + " � par");
			}else {
				System.out.println("O n�mero " + x + " � impar");
			}
		}else {
			System.out.println("O n�mero informado n�o � inteiro");
			
		}
		
	}

}
