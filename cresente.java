package projeto.java;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int A, B, C; // Validando as variaveis
		int maior, meio, menor;

		System.out.print("Informe o valor de A , B , C respectivamente: "); // pedindo para o usuario informar o valor
		A = ler.nextInt();
		B = ler.nextInt(); // leitura dos valores
		C = ler.nextInt();

		if (A >= B && A >= C) {

			maior = A;

			if (B >= A) {

				meio = B;
				menor = C;

				System.out.println(maior + meio + menor);
			} else if (B >= A && B >= C) {

				maior = B;

				if (A >= C)
					;

				meio = A;
				menor = C;
				
				System.out.println(maior + meio + menor);
			}else if(C >= A && C >= B) {
				
				maior = C;
				
				if(A >= B);
				
				meio = A;
				menor = B;
				
				System.out.println(maior + meio + menor);
			}else {
				
				System.out.print("batata");
				
			}

		}

	}
}
