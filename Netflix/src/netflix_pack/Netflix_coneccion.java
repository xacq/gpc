package netflix_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Netflix_coneccion {
	
	private static final String control = "com.mysql.cj.jdbc.Driver";//clase de coneccion
	private static final String direccion = "jdbc:mysql://localhost:3306/db_netflix";//direccion de conexion 
	private static final String usuario = "root";//usuario de la db
	private static final String password = "";//contrasena
		
	public Connection getConectar(){

		Connection conecto = null;
		try {
                    Class.forName(control);// esta es la nueva clase de conecccion 
                    conecto = DriverManager.getConnection(direccion,usuario,password);// aqui se manipual el driver para coneccion
                }catch (ClassNotFoundException | SQLException ex) {
                
                }
            return conecto;
	}
}

