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
//e o total geral do pedido. Considere que o cliente deve informar quando o
//pedido deve ser encerrado.

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO07 {
	
	 public static void main(String[] args) {
		 
	        Scanner teclado = new Scanner(System.in);
	        
	        double total = 0 , item = 0;
	        int codigo, quantidade;
	        char resposta;
	        String nomeitem = "";
	 
	        System.out.println("Especificação_Código_Preço");	        
	        System.out.println("Cachorro Quente -100- R$ 1,20");
	        System.out.println("Bauru Simples -101- R$ 1,30");
	        System.out.println("Bauru com ovo -102- R$ 1,50");
	        System.out.println("Hambúrguer -103- R$ 1,20");
	        System.out.println("Cheeseburguer -104- R$ 1,30");
	        System.out.println("Refrigerante -105- R$ 1,00");   
	        
	        do {
	            System.out.print("Digite o código do item:");
	            codigo = teclado.nextInt();
	                     
	            System.out.print("Digite a quantidade: ");
	            quantidade = teclado.nextInt();
	            
	            if (codigo == 100) {
	            	item = quantidade*1.2;
	            	nomeitem = "Cachorro Quente";
	            }
	            
	            else if (codigo == 101) {
	            	item = quantidade*1.3;
	            	nomeitem = "Bauru Simples";
	            }
	            else if (codigo == 102) {
	            	item = quantidade*1.5;
	            	nomeitem = "Bauru com Ovo";
	            }
	            else if (codigo == 103) {
	            	item = quantidade*1.2;
	            	nomeitem = "Hambúrguer";
	            }
	            else if (codigo == 104) {
	            	item = quantidade*1.3;
	            	nomeitem = "Chesseabúrguer";
	            }
	            else if (codigo == 105) {
	            	item = quantidade*1.0;
	            	nomeitem = "Refrigerante";
	            } else {
                System.out.println("Código inválido!");
	            }
	            
	            total = total + item;
	            
                System.out.println("Item: " +nomeitem);
                System.out.println("Quantidade: " +quantidade);
                
	            System.out.print("Deseja fazer mais pedidos[S/N]:");
	            resposta = teclado.next().charAt(0);
	            
	        } while (resposta == 'S' || resposta == 's');
	        
	        System.out.println("Total: "+total); 
	        
	        teclado.close();
	 	}
} 