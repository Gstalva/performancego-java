package projetojavaecomerce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int escolha;
		
		
		do {
		System.out.println ("---Perfumaria---\n"
				+ "1-Cadastrode produto \n"
				+ "2-Lance os produtos \n"
				+ "3-Buscar Produto \n"
				+ "4-Ver Produtos \n"
				+ "5-Deletar Produtos \n"
				+ "6-Sair \n"
				+ "Escolha a Opção Desejada \n");
		try {
			escolha = scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException e){
			System.out.println("\nDigite valores inteiros!");
			scan.nextLine();
			escolha = 0;
		}
		switch (escolha){
		case 1: 
			System.out.println("Cadastre o Produto");
			break;
		case 2:
			System.out.println("Lance os Produtos");
			break;
		case 3:
			System.out.println("Buscar o Produto");
			break;
		case 4:
			System.out.println("Ver Produtos");
			break;
		case 5:
			System.out.println("Deletar Produtos");
			break;
		case 6:
			System.out.println("Sair");
			break;
		default:
			System.out.println("invalido");
		}
		
		}while(escolha != 6);
		
	}
}