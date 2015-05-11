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
public class FactoryGraneleiro extends AbstractNavioCargaFactory{

    @Override
    public Navio create(int QtdPessoas, int QtdCarga) {
        return new NavioGraneleiro(QtdPessoas, QtdCarga);
    }
    
}