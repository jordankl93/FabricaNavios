/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class FactoryCargaGeralTest {
    FactoryCargaGeral fabricaCargaGeral;
    
    @Before
    public void before() {
        fabricaCargaGeral = new FactoryCargaGeral();
    }

    @Test
    public void testSomeMethod() {
        Navio navioCargaGeral = new NavioCargaGeral(10, 100);
        
        Navio navioFabrica = fabricaCargaGeral.create(10, 100);
        Assert.assertEquals(navioCargaGeral.getClass(), navioFabrica.getClass());
    }
    
}
