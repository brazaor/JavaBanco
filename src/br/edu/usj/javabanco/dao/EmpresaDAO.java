package br.edu.usj.javabanco.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.usj.javabanco.entity.Empresa;

public class EmpresaDAO {

	public List<Empresa> listarEmpresas(){
		List<Empresa> empresas = new ArrayList<Empresa>();
		return empresas;
	}
	
	public boolean gravarEmpresa(Empresa e) {
		int resultado = 0;
		return resultado > 0;
	}
	
	public boolean excluirEmpresa(int codigo) {
		int resultado = 0;
		return resultado > 0;
	} 
}
