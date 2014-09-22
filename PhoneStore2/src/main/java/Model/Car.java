package Model;

public class Car {
	
	public String fabricante;
	public int ano;
	
	public Car() {
	}

	public String getFrabricante(){
		return this.fabricante;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setFabricante(String fabricante){
		this.fabricante = fabricante;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
}
