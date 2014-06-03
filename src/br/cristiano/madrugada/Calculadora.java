package br.cristiano.madrugada;

public class Calculadora {
	public Double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public Double dividir(double valor1, double valor2)
			throws IllegalArgumentException {
		if (valor2 == 0)
			throw new IllegalArgumentException(
					"Erro: N�o h� divis�o por zero!");
		return valor1 / valor2;
	}

	public Double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public Double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
}
