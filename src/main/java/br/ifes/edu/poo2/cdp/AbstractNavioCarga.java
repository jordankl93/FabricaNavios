/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

/**
 *
 * @author Jordan-Not
 */
public abstract class AbstractNavioCarga implements Navio{
    private int capacidadePessoa;
    private int capacidadeCarga;

    public AbstractNavioCarga() {
    }   

    public AbstractNavioCarga(int capacidadePessoa, int capacidadeCarga) {
        this.capacidadePessoa = capacidadePessoa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadePessoa() {
        return capacidadePessoa;
    }

    public void setCapacidadePessoa(int capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
}
