/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainaula12;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author 55649
 */
public class MainAula12 {

    public static void main(String[] args) {
        FilaVeiculos estacCentral = new FilaVeiculos();
	Veiculos carAux = new Veiculos(0);
        Random gerador = new Random();

do{
    if (gerador.nextInt(2) == 0) {
        System.out.println("C - Um novo veículo chegou!");
    if (estacCentral.estaCheia()) {
	System.out.println("Infelizmente o estacionamento esta cheio!\n");
	}
	else{
            estacCentral.insere(new Veiculos(gerador.nextInt(10)));
                System.out.println("Veículo de " + estacCentral.ultimo() + " estacionado!\n");
    }
        }
	else {
    if (!estacCentral.estaVazia()) { // tirar carro
	System.out.println("\n"+estacCentral);
            int placa = Integer.parseInt(JOptionPane.showInputDialog("Digite a placa do veículo para que ele possa sair do estacioanamento:"));
        while(placa != estacCentral.primeiro().getPlaca()){ // fazer manobra com os carros que estão na frente
	carAux = estacCentral.primeiro();
	carAux.setVoltas(1); // adicionando valor 1 as voltas no Carro classe Carro (para contar as manobras no quarteirao)
	estacCentral.remove();
	estacCentral.insere(carAux);
            System.out.println(estacCentral + "<- Carro manobrado");
		}
	carAux = estacCentral.remove();
            System.out.println("\nP - Carro " + carAux + " saiu do estacionamento!\nEle fez " + carAux.getVoltas() + " manobras no quarteirão antes de sair!\n");
	}
	else{
            System.out.println(estacCentral);
			}
		}
	}while(!estacCentral.estaVazia());
    }
}
