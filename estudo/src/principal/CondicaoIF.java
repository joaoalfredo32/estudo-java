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
			System.out.println("Voc� n�o pode entrar na balada");
			
		}else {
			System.out.println("Voc� pode entrar na balada e tomar muita cacha�a");
		}
*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Voc� bebe? (1) Sim (2) N�o");
		int bebe = sc.nextInt();
		//boolean validacao = (idade >= 18 && bebe == 1)?true:false; 
		String validacao = (idade >= 18 && bebe == 1)?"MAIOR":"MENOR";
		if(validacao.equals("MAIOR")) {
			System.out.println("Voc� tem mais de 18 anos e bebe");
		}else {
			System.out.println("Voc� tem menos de 18 anos");
		}
		
		
		
	}

}
