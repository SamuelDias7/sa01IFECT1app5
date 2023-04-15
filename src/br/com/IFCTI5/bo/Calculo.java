package br.com.IFCTI5.bo;

public class Calculo {
	private double salMin;
	private double salUsu;
	
	public double getSalMin() {
		return salMin;
	}
	public void setSalMin(double salMin) {
		this.salMin = salMin;
	}
	public double getSalUsu() {
		return salUsu;
	}
	public void setSalUsu(double salUsu) {
		this.salUsu = salUsu;
	}
	
	public void Calculo() {
		
		if(this.salUsu * 1 < this.salMin) {
			System.out.println("Menos de um salario minimo");
		} 
		else if(this.salUsu * 1 >= this.salMin && this.salUsu *1 < this.salMin *2) {
			System.out.println("1 salario minimo");
		} 
		else if(this.salUsu * 2 >= this.salMin && this.salUsu *1 < this.salMin *3) {
			System.out.println("2 salario minimo");
		} 
		else if(this.salUsu * 3 >= this.salMin && this.salUsu *1 < this.salMin *4) {
			System.out.println("3 salario minimo");
		} 
		else if(this.salUsu * 4 >= this.salMin && this.salUsu *1 < this.salMin *5) {
			System.out.println("4 salario minimo");
		} else {
			System.out.println("mais de 10 salarios minimos");
		}
		

		
	}
	
	

}
