package br.edu.usj.javabanco.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.usj.javabanco.entity.Funcionario;

public class FuncionarioDAO {

	public List<Funcionario> listarFuncionarios() {
		List<Funcionario> lista = new ArrayList<Funcionario>();		
			
		return lista;
	}
	
	public boolean gravarFuncionario(Funcionario f) {
		int resultado = 0;

		return resultado > 0;
	}
	
	public boolean excluirFuncionario(int codigo) {
		int resultado = 0;
		
		return resultado > 0;	
	}
}
