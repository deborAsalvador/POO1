//O cardápio de uma lanchonete é o seguinte:
//Especificação Código Preço
//Cachorro Quente 100 R$ 1,20
//Bauru Simples 101 R$ 1,30
//Bauru com ovo 102 R$ 1,50
//Hambúrguer 103 R$ 1,20
//Cheeseburguer 104 R$ 1,30
//Refrigerante 105 R$ 1,00
//Faça um programa que leia o código dos itens pedidos e as quantidades
//desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade)
//e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int itens = 0 ,codigo, quantidade;
		double total=0;
		
		System.out.println("O cardápio de uma lanchonete é o seguinte:");
		System.out.println("Especificação_Código_Preço ");
		System.out.println("Cachorro Quente_100_R$ 1,20");
		System.out.println("Bauru Simples_101_R$ 1,30");
		System.out.println("Bauru com Ovo_102_R$ 1,50");
		System.out.println("Hambúrguer_103_R$ 1,20");
		System.out.println("Cheeseburge_104_R$ 1,30");
		System.out.println("Refrigerante_105_R$ 1,00");
		char pedido='S';
		while (pedido == 'S' || pedido == 's') {
		
			System.out.print("Informe o codigo:");
		codigo=teclado.nextInt();
		System.out.print("Informe a quantidade:");
		quantidade=teclado.nextInt();
		System.out.print("Deseja fazer outro pedido? [S/N]:");
		pedido=teclado.next().charAt(0);
		if (codigo == 100) {
			total=total+(quantidade*1.2);	
			itens++;
			}
		if (codigo == 101) {
			total=total+(quantidade*1.3);
			itens++;
			}
		if (codigo == 102) {
			total=total+(quantidade*1.5);		
			itens++;
			}
		if (codigo == 103) {
			total=total+(quantidade*1.2);	
			itens++;
			}
		if (codigo == 104) {
			total=total+(quantidade*1.3);	
			itens++;
			}
		if (codigo == 105) {
			total=total+(quantidade*1.0);		
			itens++;
		}
		
		System.out.print("Total por "+itens+" itens:"+total);
		teclado.close();
		}
	}
}
		
