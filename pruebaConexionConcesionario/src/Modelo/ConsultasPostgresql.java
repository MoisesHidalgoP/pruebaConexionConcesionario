package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConsultasPostgresql {
public static ArrayList<dtoCoche> selectAllCoches(Connection conexionGenerada) {
		
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllCoches] Entra en selectCoches");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<dtoCoche> listCoches = new ArrayList<>();
		
		try {
			
			//Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"Concesionario\".\"coches\"");
		    
			//Llamada a la conversión a dtoAlumno
			listCoches = dtoADto.resultsetAdtoCoche(resultadoConsulta);
			int i = listCoches.size();
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllCoches] Número coches: "+i);
			
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllCoches] Cierre conexión, declaración y resultado");				
		    resultadoConsulta.close();
		    declaracionSQL.close();
		    //conexionGenerada.close();
			
		} catch (SQLException e) {
			
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			return listCoches;
			
		}
		return listCoches;
		
	}


public static ArrayList<dtoMoto> selectAllMotos(Connection conexionGenerada) {
	
	System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllMotos] Entra en selectAllAlumnos");
	Statement declaracionSQL = null;
	ResultSet resultadoConsulta = null;
	ArrayList<dtoMoto> listMotos = new ArrayList<>();
	
	try {
		
		//Se abre una declaración
		declaracionSQL = conexionGenerada.createStatement();
		//Se define la consulta de la declaración y se ejecuta
		resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"Concesionario\".\"motos\"");
	    
		//Llamada a la conversión a dtoAlumno
		listMotos = dtoADto.resultsetAdtoMoto(resultadoConsulta);
		int i = listMotos.size();
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllMotos] Número Motos: "+i);
		
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllMotoss] Cierre conexión, declaración y resultado");				
	    resultadoConsulta.close();
	    declaracionSQL.close();
	    //conexionGenerada.close();
		
	} catch (SQLException e) {
		
		System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		return listMotos;
		
	}
	return listMotos;
	
}
}
