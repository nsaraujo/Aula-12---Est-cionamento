/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaula12;
import java.util.Set;
/**
 *
 * @author 55649
 */
public class Veiculos {
    private int placa;
    private int voltas; 

    public Veiculos(int placa){ 
        setPlaca(placa);
    }

    public int getVoltas() {
        return voltas;
    }
    public void setVoltas(int voltas) {
        this.voltas = this.voltas + voltas;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return "Placa: " + this.placa;
    }
}
