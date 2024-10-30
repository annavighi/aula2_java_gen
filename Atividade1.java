package java_pratica2;

	import java.util.Scanner;

		public class Atividade1 {

			public static void main(String[] args) {

	Scanner soma = new Scanner(System.in);

		int a, b, c;

		System.out.println("\nDigite o número A: ");
		a = soma.nextInt();
		
		System.out.println("\nDigite o número B: ");
		b = soma.nextInt();
		
		System.out.println("\nDigite o número C: ");
		c = soma.nextInt();

		if(a + b > c) {
			System.out.println("\nResultado: " + (a+b) + "\nA soma de A+B é maior que C");
			
		}else if(a + b == c) {
			System.out.println("\nResultado: " + (a+b) + "\nA soma de A+B é igual a C");
			
		}else{
			System.out.println("\nResultado: " + (a+b) + "\nA soma de A+B é menor que C");
		}
	}

}
