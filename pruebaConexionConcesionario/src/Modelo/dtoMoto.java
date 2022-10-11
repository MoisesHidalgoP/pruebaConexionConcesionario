package Modelo;

public class dtoMoto {
	public dtoMoto(int id, String nomM, String matM) {
		
		id_moto = id;
		nombremoto = nomM;
		matricula = matM;
		
		
	}
	
	//Atributos	
	int id_moto;
	String nombremoto;
	String matricula;

	public int getId_moto() {
		return id_moto;
	}
	public void setId_moto(int id_moto) {
		this.id_moto = id_moto;
	}
	public String getNombremoto() {
		return nombremoto;
	}
	public void setNombremoto(String nombremoto) {
		this.nombremoto = nombremoto;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
