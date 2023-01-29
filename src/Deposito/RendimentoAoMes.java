package Deposito;

import java.util.Locale;
import java.util.Scanner;

public class RendimentoAoMes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ValorDepositado;

		System.out.println("Digite o valor depositado: ");
		ValorDepositado = sc.nextDouble();

		// juros fixo da poupança em 0,07% a.m
		System.out.println("Rendimento ao mês: " + (0.07 * ValorDepositado));

		sc.close();
	}

}
