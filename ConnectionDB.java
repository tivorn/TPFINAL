package tpfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private Connection connection;
	
	public ConnectionDB() {
		this.connection = null;
	}
	
	private void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public boolean openConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/victo/Desktop/PROJ/Current/sqlite_db/acervo.db");
			this.setConnection(connection);
			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public boolean closeConnection() {
		try {
			if(this.getConnection() != null)
				this.getConnection().close();
				return true;
		} catch (SQLException error) {
				System.out.println(error.getMessage());
				return false;
		}
	}
}
