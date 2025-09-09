//Faça um Programa que pergunte quanto você ganha por hora e o número de
//horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8%
//para o INSS e 5% para o sindicato, faça um programa que nos dê:
//- Salário bruto.
//- Quanto pagou ao INSS.
//- Quanto pagou ao sindicato.
//- O salário líquido.
//Calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido
//Utilize métodos para calcular cada um dos descontos, o total de descontos e o salário líquido.

package atividades;

import java.util.Scanner;

public class IntroduçãoaPOO04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Quanto você ganha por hora:");
		double vh=teclado.nextFloat();
		System.out.print("Qual o numero de horas trabalhadas no mês:");
		double nh=teclado.nextFloat();
		double salariob=vh*nh;
		double ir=(salariob/100)*11;
		double inss=(salariob/100)*8;
		double sindicato=(salariob/100)*5;
		System.out.print("Salario Bruto:R$"+salariob+",\n(-)IR(11%)("+ir+"):R$"+((salariob/100)*ir)+
				"\n(-)Sindicato(5%):R$"+sindicato+"\n(-)INSS(8%\"%):R$"+inss+"\n"
						+ "Salario Liquido:R$"+(salariob-(((salariob/100)*ir)+sindicato+inss)));
		teclado.close();
	}
}

