package tpfinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
	
	private Connection connection;
	
	public CRUD(Connection connection) {
		this.connection = connection;
	}
	
	public boolean create(String titulo, int id_categoria, String autor) {
		Statement statement;
		try {
			statement = this.connection.createStatement();
			statement.executeUpdate("INSERT INTO Livro (titulo, autor, id_categoria) VALUES ('"+titulo+"','"+autor+"', "+id_categoria+")");
			
			System.out.println("Inserção realizada!");
			
			return true;
			
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public boolean read(int id_livro) {
		try {
			Statement statement = this.connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM Livro WHERE id_livro = " + id_livro);
			
			int id = result.getInt("id_livro");
			String titulo = result.getString("titulo");
			
			System.out.println(id + " - " + titulo);
			
			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public boolean detect(String contains_titulo) {
		try {
			Statement statement = this.connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM Livro WHERE titulo LIKE " + "'%" + contains_titulo + "%'");
			
			System.out.println("Encontramos estes livros no banco de dados: ");
			
			while (result.next()) {
				int id = result.getInt("id_livro");
				String titulo = result.getString("titulo");
				
				System.out.println(id + " - " + titulo);
			}
			
			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public boolean update(int id_livro, String titulo) {
		try {
			Statement statement = this.connection.createStatement();
			statement.executeQuery("UPDATE Livro SET titulo = " + titulo + " WHERE id_livro = " + id_livro);

			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
	
	public boolean delete(int id_livro) {
		try {
			Statement statement = this.connection.createStatement();
			statement.executeQuery("DELETE FROM Livro WHERE id_livro = " + id_livro);
			
			System.out.println("Remoção realizada!");

			return true;
		} catch (SQLException error) {
			System.out.println(error.getMessage());
			return false;
		}
	}
}
