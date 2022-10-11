package Modelo;

public class dtoCoche {
	//Constructor completo
			public dtoCoche(int id, String nomC, String matC) {
				
				id_coche = id;
				nombrecoche = nomC;
				matriculacoche = matC;
				
				
			}
			
			//Atributos	
			int id_coche;
			String nombrecoche;
			String matriculacoche;
			
			public int getId_coche() {
				return id_coche;
			}
			public void setId_coche(int id_coche) {
				this.id_coche = id_coche;
			}
			public String getNombrecoche() {
				return nombrecoche;
			}
			public void setNombrecoche(String nombrecoche) {
				this.nombrecoche = nombrecoche;
			}
			public String getMatriculacoche() {
				return matriculacoche;
			}
			public void setMatriculacoche(String matriculacoche) {
				this.matriculacoche = matriculacoche;
			}

			
			
		

}
