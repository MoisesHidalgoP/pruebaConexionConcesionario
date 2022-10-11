package Modelo;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class dtoADto {
public static ArrayList<dtoCoche> resultsetAdtoCoche(ResultSet resultadoConsulta){
		
		System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoCoche] Entrando en resultsetAdtoCoche");
		ArrayList<dtoCoche> listCoches = new ArrayList<>();
		
		//Leemos el resultado de la consulta hasta que no queden filas
		try {
			while ( resultadoConsulta.next() ) {
				
				listCoches.add(new dtoCoche(resultadoConsulta.getInt("id_coche"),
						resultadoConsulta.getString("nombrecoche"),
						resultadoConsulta.getString("matriculacoche")
						
						));
			}
			
			int i = listCoches.size();
			System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoCoche] Número coches: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listCoches;
		
	}


public static ArrayList<dtoMoto> resultsetAdtoMoto(ResultSet resultadoConsulta){
	
	System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoCoche] Entrando en resultsetAdtoCoche");
	ArrayList<dtoMoto> listMotos = new ArrayList<>();
	
	//Leemos el resultado de la consulta hasta que no queden filas
	try {
		while ( resultadoConsulta.next() ) {
			
			listMotos.add(new dtoMoto(resultadoConsulta.getInt("id_moto"),
					resultadoConsulta.getString("nombremoto"),
					resultadoConsulta.getString("matricula")
					
					));
		}
		
		int i = listMotos.size();
		System.out.println("[INFORMACIÓN-resultsetAdtoCoche-resultsetAdtoCoche] Número coches: "+i);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return listMotos;
	
}

}
