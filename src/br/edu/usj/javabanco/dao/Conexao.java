package br.edu.usj.javabanco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/java_banco", "root", "rafael00");
		} catch (ClassNotFoundException e1) {
			System.err.println("Driver não encontrado!");
			e1.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Erro ao conectar ao banco de dados!");
			e.printStackTrace();
		}
		return conexao;
	}
}
