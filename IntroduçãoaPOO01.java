//Faça um programa que peça ao usuário nome e sobrenome separadamente
//e após junte-os com a mensagem “Seu nome completo é: NomeSobreNome”;

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Nome:");
		String nome=teclado.nextLine();
		System.out.print("Sobrenome:");
		String sobrenome=teclado.nextLine();
			System.out.print("Seu nome completo é: "+nome+" "+sobrenome);
		teclado.close();
	}	
}
