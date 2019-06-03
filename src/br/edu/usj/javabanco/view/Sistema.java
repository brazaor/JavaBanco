package br.edu.usj.javabanco.view;

import java.util.Scanner;

import br.edu.usj.javabanco.dao.EmpresaDAO;

public class Sistema {

	EmpresaDAO empresaDAO;
	
	public Sistema() {
		empresaDAO = new EmpresaDAO(); 
	}
	
	public void gravarEmpresa() {

	}
	
	public void removerEmpresa(){

	}
	
	public void listarEmpresas() {

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
