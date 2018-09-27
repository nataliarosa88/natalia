package br.com.fornecedores.test;
import org.junit.Test;

import br.com.fornecedores.model.Fornecedor;

public class FornecedorTest {
	@Test
	public  void testat () {
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setNome("joao");
		fornecedor1.setEmail("j@j.com");
		fornecedor1.setTelefone("3232-3232");
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getTelefone());
		
	}

}
