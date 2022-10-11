package Controlador;



import java.sql.Connection;
import java.util.ArrayList;

import Modelo.ConexionPostgreSQL;
import Modelo.ConsultasPostgresql;
import Modelo.ConsultasPostgresql;
import Modelo.dtoCoche;
import Modelo.dtoMoto;
import Util.variablesConecioPostgresql;

public class ControladorPostgresql {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
			//CONSTANTES
			final String HOST = variablesConecioPostgresql.getHost();
			final String PORT = variablesConecioPostgresql.getPort();
			final String DB = variablesConecioPostgresql.getDb();
			final String USER = variablesConecioPostgresql.getUser();
			final String PASS = variablesConecioPostgresql.getPass();
			ArrayList<dtoCoche> listCoches = new ArrayList<>();
			ArrayList<dtoMoto> listMotos = new ArrayList<>();
			

			
			/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
			*utilizando el método generaConexion
			*/
			
			
			System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
			ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
			Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
			
			if(conexionGenerada != null) {
				
				//Llamar al método que ejecuta la consulta
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada selectAllCoches");
				listCoches = ConsultasPostgresql.selectAllCoches(conexionGenerada);
				int i = listCoches.size();
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número coches: "+i);
				for(Modelo.dtoCoche coches: listCoches) {
					System.out.println(coches.getId_coche()+" "+coches.getNombrecoche()+" "+coches.getMatriculacoche());			}
				}
			
			
	        if(conexionGenerada != null) {
				
				//Llamar al método que ejecuta la consulta
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada selectMotos");
				listMotos = ConsultasPostgresql.selectAllMotos(conexionGenerada);
				int i = listMotos.size();
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número motos: "+i);
				for(Modelo.dtoMoto motos: listMotos) {
					System.out.println(motos.getId_moto()+" "+motos.getNombremoto()+" "+motos.getMatricula());			}
				}
	        
				
				
			}		
		
		}


		
		
