package br.com.IFCTI5.bo;

public class Calculo {
	private int salMin;
	private int salUsu;
	
	public double getSalMin() {
		return salMin;
	}
	public void setSalMin(int salMin) {
		this.salMin = salMin;
	}
	public double getSalUsu() {
		return salUsu;
	}
	public void setSalUsu(int salUsu) {
		this.salUsu = salUsu;
	}

	public void Calculo() {
		
		if(this.salUsu < this.salMin) {
			System.out.println("menos de um slario minimo");
		}
		else if(this.salUsu / this.salMin == 1) {
			System.out.println("1 salarios");
		}
		else if(this.salUsu / this.salMin == 2) {
			System.out.println("2 salarios");
		}
		else if(this.salUsu / this.salMin == 3) {
			System.out.println("3 salarios");
		}
		else if(this.salUsu / this.salMin == 4) {
			System.out.println("4 salarios");
		}
		else if(this.salUsu / this.salMin == 5) {
			System.out.println("5 salarios");
		}
		else if(this.salUsu / this.salMin == 6) {
			System.out.println("6 salarios");
		}
		else if(this.salUsu / this.salMin == 7) {
			System.out.println("7 salarios");
		}
		else if(this.salUsu / this.salMin == 8) {
			System.out.println("8 salarios");
		}
		else if(this.salUsu / this.salMin == 9) {
			System.out.println("9 salarios");
		}
		else if(this.salUsu / this.salMin == 10) {
			System.out.println("10 salarios");
		}
			
		else {
			System.out.println("Mais de 10 salarios minimos");
		}
		
	}
	
	

}
