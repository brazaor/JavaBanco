package br.edu.usj.javabanco.view;

import java.util.List;
import java.util.Scanner;

import br.edu.usj.javabanco.dao.EmpresaDAO;
import br.edu.usj.javabanco.entity.Empresa;

public class Sistema {

	EmpresaDAO empresaDAO;
	
	public Sistema() {
		empresaDAO = new EmpresaDAO(); 
	}
	
	@SuppressWarnings("resource")
	public void gravarEmpresa() {
		Scanner scanner = new Scanner(System.in);
		Empresa empresa = new Empresa();
		System.out.println("Digite o nome da empresa:");
		empresa.setNome(scanner.next());
		System.out.println("Digite o ano de fundação da empresa:");
		empresa.setAnoFundacao(scanner.nextInt());
		System.out.println("Digite o ramo de atuação da empresa:");
		empresa.setRamoAtuacao(scanner.next());
		System.out.println("Digite o capital da empresa:");
		empresa.setCapital(scanner.nextFloat());
		
		boolean gravou = empresaDAO.gravarEmpresa(empresa);
		if (gravou) {
			System.out.println("Empresa gravada com sucesso!");
		}
		else {
			System.out.println("Erro ao gravar empresa!");
		}
	}
	
	@SuppressWarnings("resource")
	public void removerEmpresa(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o código da empresa a ser excluída:");
		int codigo = scanner.nextInt();		
		
		boolean excluiu = empresaDAO.excluirEmpresa(codigo);
		if (excluiu) {
			System.out.println("Empresa removida com sucesso!");
		}
		else {
			System.out.println("Erro ao remover empresa!");
		}
	}
	
	public void listarEmpresas() {
		List<Empresa> lista = empresaDAO.listarEmpresas();
		
		System.out.println("Lista de empresas:");
		for(Empresa e: lista) {
			System.out.println("Id: "+e.getId());
			System.out.println("Nome: "+e.getNome());
			System.out.println("Fundação: "+e.getAnoFundacao());
			System.out.println("Ramo de Atuação: "+e.getRamoAtuacao());
			System.out.println("Capital: "+e.getCapital());
			System.out.println("");
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Sistema s = new Sistema();
		Scanner scanner = new Scanner(System.in);
		int codigo = 10;
		do {
			System.out.println("Sistema de gestão de empresas: ");
			System.out.println("Digite a opção:");
			System.out.println("1 - Gravar empresas");
			System.out.println("2 - Remover empresas");
			System.out.println("3 - Listar empresas");
			System.out.println("0 - Sair");
			System.out.print(": ");
			codigo = scanner.nextInt();
			
			switch (codigo) {
			case 1:
				s.gravarEmpresa();
				System.out.println("");
				break;
			case 2:
				s.removerEmpresa();
				System.out.println("");
				break;
			case 3:
				s.listarEmpresas();
				System.out.println("");
				break;
			case 0:
				System.out.println("Saindo do sistema...");
				System.out.println("Pronto!");
				break;	

			default:
				System.out.println("Opção inválida!");
				System.out.println("");
				break;
			}
			
		}while (codigo != 0);
			
	}

}
