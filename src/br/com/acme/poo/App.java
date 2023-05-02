package br.com.acme.poo;

public class App {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setCor("Preto");
		carro.setModelo("Fiorino");
		carro.setCapacidadeTanque(100);

		System.out.println(carro.valorTanqueCheio(6.39));
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getCapacidadeTanque());

		Carro carro2 = new Carro("Towner", "Azul", 150);

		System.out.println(carro2.valorTanqueCheio(7.39));
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());

	}

}
