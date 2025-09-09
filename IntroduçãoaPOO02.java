//Faça um programa que mostre os números que constam no intervalo entre
//dois números que serão informados, se o usuário entrar com os valores em
//ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
//a inversão.

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO02 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Insira dois numeros inteiros:");
		int num1=teclado.nextInt();
		int num2=teclado.nextInt();
		if (num1<num2) {
		for (int i=num1;i<=num2;i++) {
			System.out.println(i);
		}}else {
			System.out.println("Será feito a inversão da ordem dos numeros:");	
			int num=num1;
			num1=num2;
			num2=num;
			for (int i=num1;i<=num2;i++) {
					System.out.println(i);
			}
		}teclado.close();
	}
}
