package br.com.IFCTI5.app;

import java.util.Scanner;

import br.com.IFCTI5.bo.Calculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Scanner leia = new Scanner(System.in);
		Calculo obj = new Calculo();
		
		System.out.println("Informe o valor do salário minimo:");
		int salMin = leia.nextInt();
		
		obj.setSalMin(salMin);
		
		System.out.println("Informe o seu salário:");
		int salUsu = leia.nextInt();
		
		// Passando o valor da variavel salUsu para o metodo setSalUsu
		obj.setSalUsu(salUsu);
		
		obj.Calculo();
		
		
		
		
		
		
		

	}

}
