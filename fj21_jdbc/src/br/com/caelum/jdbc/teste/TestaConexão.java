package br.com.caelum.jdbc.teste;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexão {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();

	}

}
