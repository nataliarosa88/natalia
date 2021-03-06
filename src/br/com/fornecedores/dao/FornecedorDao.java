package br.com.fornecedores.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import br.com.fornecedores.model.Fornecedor;
import br.com.fornecedores.util.DbUtil;

public class FornecedorDao {

	private Connection connection;

	public FornecedorDao() {
		connection = DbUtil.getConnection();
	}

	public void deleteFornecedor(int fornecedorCodigo) {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from fornecedor where codigo=?");
			preparedStatement.setInt(1, fornecedorCodigo);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Fornecedor getFornecedorById(int fornecedorCodigo) {
		Fornecedor fornecedor = new Fornecedor();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from fornecedor where codigo=?");
			preparedStatement.setInt(1, fornecedorCodigo);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				fornecedor.setCodigo(rs.getInt("codigo"));
				fornecedor.setNome(rs.getString("nome"));
				fornecedor.setEmail(rs.getString("email"));
				fornecedor.setTelefone(rs.getString("telefone"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return fornecedor;

	}
	
	
	
	public void updateFornecedor(Fornecedor fornecedor) {
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update fornecedor set nome=?, email=?, telefone=?" + "where codigo=?");
			preparedStatement.setString(1, fornecedor.getNome());
			preparedStatement.setString(2, fornecedor.getEmail());
			preparedStatement.setString(3, fornecedor.getTelefone());
			preparedStatement.setInt(4, fornecedor.getCodigo());
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

	public void addFornecedor(Fornecedor fornecedor) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO fornecedor (nome, email, telefone) VALUES (?,?,?)");
			preparedStatement.setString(1, fornecedor.getNome());
			preparedStatement.setString(2, fornecedor.getEmail());
			preparedStatement.setString(3, fornecedor.getTelefone());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Fornecedor> getAllFornecedores() {
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM fornecedor");
			while (rs.next()) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.setCodigo(rs.getInt("codigo"));
				fornecedor.setNome(rs.getString("nome"));
				fornecedor.setEmail(rs.getString("email"));
				fornecedor.setTelefone(rs.getString("telefone"));
				fornecedores.add(fornecedor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fornecedores;
	}

}
