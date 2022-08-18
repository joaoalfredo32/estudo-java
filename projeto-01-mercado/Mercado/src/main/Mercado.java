package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Produto;

public class Mercado {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[] args) {
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}
	
	private static void menu() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("-------------- Bem Vindo as Lojas Alfredo ---------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("********* Selecione uma opera��o que deseja realizar **********");
		System.out.println("---------------------------------------------------------------");
		System.out.println("|     Op��o 1 - Cadastrar |");
		System.out.println("|     Op��o 2 - Listar    |");
		System.out.println("|     Op��o 3 - Comprar   |");
		System.out.println("|     Op��o 4 - Carrinho  |");
		System.out.println("|     Op��o 5 - Sair      |");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			cadastrarProdutos();
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			comprarProdutos();
			break;
		case 4:
			verCarrinho();
			break;
		case 5:
			System.out.println("obrigado pela prefer�ncia!");
			System.exit();
		default:
			System.out.println("Op��o Inv�lida");
			menu();
			break;
		}
		
	}

}
