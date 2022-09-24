package listaDeExercicios3;

import entidade.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica lucia = new PessoaFisica("lucia", "094.891.548-06");
		lucia.setDataNascimento("19/09/1967");
		
		PessoaFisica outro = lucia;
		
		System.out.println(outro);
		System.out.println(lucia);
		
		
	}

}
