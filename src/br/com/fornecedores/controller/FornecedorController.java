package br.com.fornecedores.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fornecedores.dao.FornecedorDao;
import br.com.fornecedores.model.Fornecedor;

public class FornecedorController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private static String LIST_FORNECEDOR = "/listFornecedor.jsp";
	private FornecedorDao dao;
	
	
	public FornecedorController() {
    	super();
    	dao = new FornecedorDao();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("listFornecedor")) {
			forward = LIST_FORNECEDOR;
			request.setAttribute("fornecedores", dao.getAllFornecedores());
		}
	
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome(request.getParameter("nome"));
		fornecedor.setEmail(request.getParameter("email"));
		fornecedor.setTelefone(request.getParameter("telefone"));
	
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEmail());
		System.out.println(fornecedor.getTelefone());
	
	}

}
