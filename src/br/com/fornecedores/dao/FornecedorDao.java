package br.com.fornecedores.dao;

import java.sql.Connection;
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
	
	
	public List<Fornecedor> getAllFornecedores(){
		
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>(); 


		try {
		
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM fornecedor");
		
			
			while (rs.next()) {
				
			Fornecedor fornecedor = new Fornecedor();
			
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
