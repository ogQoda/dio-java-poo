package br.com.acme.poo;

public class Carro {

	String modelo;
	String cor;
	int capacidadeTanque;

	public Carro() {
	}

	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}

	public Carro(String modelo, String cor, int capacidadeTanque) {
		this.modelo = modelo;
		this.cor = cor;
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double valorTanqueCheio(double valor) {
		return this.capacidadeTanque * valor;
	}

}
