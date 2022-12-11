/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaula12;

/**
 *
 * @author 55649
 */
public class FilaVeiculos {
	private Veiculos[] dados;
	private int primeiro;
	private int ultimo;
	private int quantidade;
	private int capacidade;
	
	public FilaVeiculos () {
		this.dados = new Veiculos[10];
		this.capacidade = 10;
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0;
	}
	public boolean estaVazia() {
		return this.quantidade == 0;
	}
	public boolean estaCheia() {
		return this.quantidade == this.capacidade;
	}
	private int proxima (int posicao) {
		return (posicao + 1)%this.capacidade;
	} 
	private int anterior (int posicao) {
		return (posicao -1+this.capacidade)% this.capacidade;
	}
		
	public void insere (Veiculos dados){
		this.dados[this.ultimo] = dados;
		this.ultimo	= proxima(this.ultimo);
		this.quantidade++;
	}
	public Veiculos remove() {
		Veiculos quemSai = this.dados[this.primeiro];
		this.primeiro = proxima(this.primeiro);
		this.quantidade--;
		return quemSai;
	}
	public Veiculos primeiro () {
		return this.dados[this.primeiro];
	}
	public int tamanho () {
		return this.quantidade;
	}
	public Veiculos ultimo () {
		return this.dados[anterior(this.ultimo)];
	}
	@Override
	public String toString () {
		String s = "Fila: ";
		if (this.estaVazia()) {
			s = s + "vazia";
		}
		else {
			int i = this.primeiro;
			do {
				s = s+this.dados[i] + " ";
				i = proxima(i);
			}while (i!=this.ultimo);
		}
		return s;
	}
	public String stringVetor() {
		int i;
		String s = "";
		if(this.estaVazia()) {
			for(i=0; i<this.capacidade; i++) {
				s = s  + "_ ";
			}
		}
		else if (this.estaCheia()) {
			for (i = 0; i<this.capacidade; i++) {
				s = s + this.dados[i] + " ";
			}
		}
		else if (this.primeiro < this.ultimo) {
			for (i=0; i>this.primeiro; i++) {
				s = s +"_ "; 
			}
			for (i = this.primeiro; i<this.ultimo; i++) {
				s = s + this.dados[i] + " ";
			}
			for (i = this.ultimo; i<this.capacidade; i++) {
				s = s + "_ ";
			}
		}
		else {
			for (i=0; i<this.ultimo; i++) {
				s = s + this.dados[i] + " ";
			}
			for (i = this.ultimo; i<this.primeiro; i++) {
				s = s+ "_ ";
			}
			for (i=this.primeiro; i<this.capacidade; i++) {
				s = s + this.dados[i] + " ";
			}
		}
		return s;
	}
}
