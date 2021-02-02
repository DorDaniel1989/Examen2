package test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import core.*;

class CalculadoraTest {
    @Test
    @DisplayName("comprobar un numero escrito a int")
    void TestStringAInt() {
        Calculadora cal = new Calculadora();
        int resultado = cal.StringAInt(" uNo ");    
       assertEquals(1, resultado);
     }   
    

   
      @Test
      @DisplayName("comprobar entrada de numeros a arraylist")
      void TestReglaDe3E() {
          Calculadora cal = new Calculadora();
          double[] regla3=new double[10];
          double[] salida={10, 20, 30, 40};
          
           regla3 = cal.reglaDe3E(regla3, 100);    
           assertEquals(salida ,regla3);
       }   
    

 }
    

    


    
    
