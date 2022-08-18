package principal;

import java.util.Scanner;

public class CondicaoIF {
	public static void main(String[] args) {
		/*Estudo baseado nas video aulas de: Luiz Segundo Dev
		 * https://www.youtube.com/channel/UC6AHsMB_L3EoocGssU2uJBQ
		 */
/*		
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Você não pode entrar na balada");
			
		}else {
			System.out.println("Você pode entrar na balada e tomar muita cachaça");
		}
*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Você bebe? (1) Sim (2) Não");
		int bebe = sc.nextInt();
		//boolean validacao = (idade >= 18 && bebe == 1)?true:false; 
		String validacao = (idade >= 18 && bebe == 1)?"MAIOR":"MENOR";
		if(validacao.equals("MAIOR")) {
			System.out.println("Você tem mais de 18 anos e bebe");
		}else {
			System.out.println("Você tem menos de 18 anos");
		}
		
		
		
	}

}
