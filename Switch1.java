package java_pratica2;

	import java.util.Scanner;

		public class Switch1 {

			public static void main(String[] args) {

	int codigo, quantidade;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("				Menu				");
	System.out.println("\n 1	-	Cachorro-quente	-	Preço: R$10.00");
	System.out.println("\n 2	-	X-Salada	-	Preço:R$15.00");
	System.out.println("\n 3	-	X-Bacon	-	Preço:R$18.00");
	System.out.println("\n 4	-	Bauru	-	Preço:R$12.00");
	System.out.println("\n 5	-	Refrigerante	-	Preço:R$8.00");
	System.out.println("\n 6	-	Suco de laranja	-	Preço:R$13.00");
	
		System.out.println("\nDigite o código do produto: ");
			codigo = entrada.nextInt();
		
		System.out.println("\nDigite a quantidade: ");
			quantidade = entrada.nextInt();

	switch(codigo){
		
		case 1:
			System.out.println("\nO valor total do pedido é: " + quantidade*10.00);
			break;
		case 2:
			System.out.println("\nO valor total do pedido é: " + quantidade*15.00);
			break;
		case 3:
			System.out.println("\nO valor total do pedido é: " + quantidade*18.00);
			break;
		case 4:
			System.out.println("\nO valor total do pedido é: " + quantidade*12.00);
			break;
		case 5:
			System.out.println("\nO valor total do pedido é: " + quantidade*8.00);
			break;
		case 6:
			System.out.println("\nO valor total do pedido é: " + quantidade*13.00);
			break;
		default:
            System.out.println("Desculpe, esse código não existe. :(");
	}
		entrada.close();
			}
		}