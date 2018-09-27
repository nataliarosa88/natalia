package br.com.fornecedores.manualTest;
import java.util.List;

import org.junit.Test;

import br.com.fornecedores.dao.FornecedorDao;
import br.com.fornecedores.model.Fornecedor;

public class FornecedorDaoTest {
	
	
	@Test
	public void TestaDao() {

		FornecedorDao fornecedor = new FornecedorDao();
		List<Fornecedor> Listagem =  fornecedor.getAllFornecedores();
	       for (Fornecedor f : Listagem) {
	           System.out.println(f.getNome()); 
	           System.out.println(f.getEmail()); 
	           System.out.println(f.getTelefone()); 
	        }
	}
	
	
	
}
