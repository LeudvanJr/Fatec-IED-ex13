package view;

import controller.StringController;

public class Principal {

	public static void main(String[] args) {
		StringController sController = new StringController();
		String palavra = "";
		String palavraInvertida = sController.inverter(palavra);
		
		System.out.println(palavraInvertida);
	}

}
