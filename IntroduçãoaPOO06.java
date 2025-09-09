//Crie uma classe que modele um quadrado:
//Atributos: Tamanho do lado
//Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

package atividades;

public class IntroduçãoaPOO06 {
	private int lado;
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	public int getLado() {
		return lado;
	}
	
	public int calcularArea() {
		return lado * lado;	
	}
}