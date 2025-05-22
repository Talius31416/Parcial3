package com.Intermedio;
import org.junit.jupiter.api.*;

public class CalcularValorTest {

    Moto moto = new Moto("123456", 10, 300);
    Camion camion = new Camion("123458", 10, 10, 8);
    Carro carro = new Carro("123467", 10, false, false);
    @Test
    public void calcularValormotoTest(){

        Assertions.assertEquals(7000, moto.calcularPeaje());
    }
    @Test
    public void calcularValorCamionTest(){
        Assertions.assertEquals(56000, camion.calcularPeaje());
    }
    @Test
    public void calcularValorCarroTest(){
        Assertions.assertEquals(10000, carro.calcularPeaje());
    }
}
