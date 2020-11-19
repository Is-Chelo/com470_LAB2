/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHELO
 */
public class CalculateSimpleTest {
    CalculateSimple calc = new CalculateSimple();
    
    
    public CalculateSimpleTest() {
    }

    @Test
    public void testAdd() {
        OperationModel operacion = new OperationModel(5,4);
        int esperado = 9 ; 
        int resultado = calc.add(operacion);
        assertEquals(esperado, resultado);
    }
    

    @Test
    public void testSubtract() {
        OperationModel operacion = new OperationModel(3,4);
        int esperado = -1 ; 
        int resultado = calc.subtract(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiply() {
        OperationModel operacion = new OperationModel(1,0);
        int esperado = 0 ; 
        int resultado = calc.multiply(operacion);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivide() {
        OperationModel operacion = new OperationModel(12,2);
        double esperado = 6.0 ; 
        double resultado = calc.divide(operacion);
        assertEquals(esperado, resultado, 0.9);
    }

    @Test
    public void testFactorial() {
        OperationModel operacion = new OperationModel(5);
        int esperado = 120 ; 
        int resultado = calc.factorial(operacion);
        assertEquals(esperado, resultado);
    }
    @Test
    public void testFibonacci() {
        OperationModel operacion = new OperationModel(8);
        int esperado = 21; 
        int resultado = calc.fibonacci(operacion);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testSqrt() {
        OperationModel operacion = new OperationModel(3);
        double esperado = 1.73;
        
        double resultado = calc.sqrt(operacion);
        assertEquals(esperado, resultado, 0.9);
    }
    
    @Test
    public void testPower() {
        OperationModel operacion = new OperationModel(8);
        int esperado = 64; 
        int resultado = calc.power(operacion);
        assertEquals(esperado, resultado);
    }
   
    @Test
    public void testClearSimple() {
        OperationModel operacion = new OperationModel();
        int esperado = 0; 
        OperationModel resultado = calc.clearSimple(operacion);
        assertEquals(esperado, resultado.getA()+resultado.getB());
    }
    
    @Test
    public void testClearAdvanced() {
        OperationModel operacion = new OperationModel();
        int esperado = 0; 
        OperationModel resultado = calc.clearAdvanced(operacion);
        assertEquals(esperado, resultado.getA()+resultado.getB());
    }
}
