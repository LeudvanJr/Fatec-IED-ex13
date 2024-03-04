package controller;

public class StringController {
	public StringController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para inverter uma string
	public String inverter(String s) {
		
		//O inverso de uma string vazia é ela mesma
		int tamanho = s.length();
		if (tamanho == 0)
			return s;
		
		//Coloca-se o ultimo caractere no comeco e inverte-se o restante da string
		String ultimoCaractere = s.substring(tamanho-1);
		s = s.substring(0, tamanho-1);
		
		return ultimoCaractere + inverter(s);
	}
}
