package br.com.fornecedores.teste;

import br.com.fornecedores.model.Fornecedor;

public class TestaFornecedor {
	
	public static void main (String args[]) {
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setNome("joao");
		System.out.println(fornecedor1.getNome());
		
		
		fornecedor1.setEmail("j@j.com");
		System.out.println(fornecedor1.getEmail());
		
		
		fornecedor1.setTelefone("3232-3232");
		System.out.println(fornecedor1.getTelefone());
	
	}

}
