package br.com.glandata;

public class SwitchCase {

	public static void main(String[] args) {
		int diaSemana = 3;

		switch (diaSemana) {
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		default:
			System.out.println("Final de semana");
			break;
		}
	}

}
