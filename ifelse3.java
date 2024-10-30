package java_pratica2;

	import java.util.Scanner;

		public class ifelse3 {

			public static void main(String[] args) {


	Scanner doador = new Scanner(System.in);
	
	String nome;
	int idade;
	boolean primeiraDoacao;

	
		System.out.println("Digite seu nome completo: ");
		nome = doador.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = doador.nextInt();
		
		System.out.println("\nÉ sua primeira doação? ");
		primeiraDoacao = doador.nextBoolean();
		
			if(primeiraDoacao == true && idade > 59) {
			System.out.println("\nDesculpe, você não está apto a doar sangue.");
	
			}else if(idade > 69 ){
			System.out.println("\nDesculpe, você não está apto a doar sangue.");
			
			}else if(idade < 18 ){
			System.out.println("\nDesculpe, você não está apto a doar sangue.");

			}else{
			System.out.println("\nTudo certo para a sua doação de sangue!");
			
			}		
				
	}

}
