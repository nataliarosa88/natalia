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
    private static String INSERT_OR_EDIT = "/fornecedor.jsp";
	private static String LIST_FORNECEDOR = "/listFornecedor.jsp";
	private FornecedorDao fornecedorDao;
	
	
	public FornecedorController() {
    	super();
    	fornecedorDao = new FornecedorDao();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward="";
		String action = request.getParameter("action");
		
		
		if (action.equalsIgnoreCase("delete")) {
			
            int fornecedorCodigo = Integer.parseInt(request.getParameter("fornecedorCodigo"));
            fornecedorDao.deleteFornecedor(fornecedorCodigo);
					
			forward = LIST_FORNECEDOR;
			request.setAttribute("fornecedor", fornecedorDao.getAllFornecedores());
		}else if (action.equalsIgnoreCase("edit")){
			
			forward = INSERT_OR_EDIT;
			
			int fornecedorCodigo = Integer.parseInt(request.getParameter("fornecedorCodigo"));
            Fornecedor fornecedor = fornecedorDao.getFornecedorById(fornecedorCodigo);
            request.setAttribute("fornecedor", fornecedor);
			
		}else if (action.equalsIgnoreCase("listFornecedor")){
			forward = LIST_FORNECEDOR;
			request.setAttribute("fornecedor", fornecedorDao.getAllFornecedores());
        } else {
            forward = INSERT_OR_EDIT;
        }
		
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fornecedor fornecedor = new Fornecedor();
		FornecedorDao fornecedorDao = new FornecedorDao();
		
		
		fornecedor.setNome(request.getParameter("nome"));
		fornecedor.setEmail(request.getParameter("email"));
		fornecedor.setTelefone(request.getParameter("telefone"));
		String codigo = request.getParameter("codigo");

        
        if(codigo == null || codigo.isEmpty()){
        	fornecedorDao.addFornecedor(fornecedor);
        }else{
            fornecedor.setCodigo(Integer.parseInt(codigo));
            fornecedorDao.updateFornecedor(fornecedor);
        }
		
		

		RequestDispatcher view = request.getRequestDispatcher(LIST_FORNECEDOR);
		request.setAttribute("fornecedor", fornecedorDao.getAllFornecedores());
		view.forward(request, response);
	
	}

}
