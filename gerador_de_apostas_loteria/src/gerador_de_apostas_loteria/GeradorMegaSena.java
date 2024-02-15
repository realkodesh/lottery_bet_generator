package gerador_de_apostas_loteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeradorMegaSena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int age;

		System.out.println("BEM-VINDO AO GERADOR DE APOSTAS PARA MEGA-SENA");
		System.out.println();
		System.out.println("Por favor digite seu nome: ");
		name = sc.nextLine();
		System.out.println();
		System.out.println("Olá, " + name+ "! Digite a sua idade: ");
		age = sc.nextInt();

		if (age < 18) {

			System.out.println();
			System.out.println(
					"Os produtos lotéricos são exclusivamente destinados ao público adulto, ou seja, para maiores de 18 anos, procure um adulto ou responsável.");

		} else {

			System.out.println();
			System.out.println("Obrigado pelas informações " + name + ", Vamos lá! ");
		

		System.out.println();
		System.out.println("Digite a quantidade de jogos que quer fazer: ");
		int numJogos = sc.nextInt();

		System.out.println();

		List<Integer> numeros = new ArrayList<>();

		for (int i = 1; i <= 60; i++)
			numeros.add(i);
		for (int i = 1; i <= numJogos; i++) {
			Collections.shuffle(numeros);
			for (int j = 0; j < 6; j++)
				System.out.println(numeros.get(j));
			System.out.println();
		}

		sc.close();

		}
	}

}
