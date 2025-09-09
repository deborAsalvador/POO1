//Faça um programa que tenha uma função para calcular as quatro operações básicas de 2 números;

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO03 {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Informe um numero para tabuada: ");
			int fator1 = teclado.nextInt();
			System.out.print("Informe um segundo numero para tabuada: ");
			int fator2 = teclado.nextInt();
			System.out.print("Informe a operação desejada [+/-/*/%]:");
			char operacao=teclado.next().charAt(0);
			if (operacao == '+') {
				System.out.println(fator1+" + "+fator2+" = "+(fator1+fator2));
			}
			else if (operacao == '-') {
				System.out.println(fator1+" - "+fator2+" = "+(fator1-fator2));
			}
			else if (operacao == '*') {
				System.out.println(fator1+" * "+fator2+" = "+(fator1*fator2));
			}
			else if (operacao == '%') {
				System.out.println(fator1+" % "+fator2+" = "+(fator1/fator2));
			}
			else
				System.out.println("Informe uma operação válida.");
			teclado.close();
		}

}
