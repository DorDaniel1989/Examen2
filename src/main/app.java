package main;
 import core.*;
 import java.util.ArrayList;
 import java.util.List;

 public class app {
    public static void main(String[] args) throws Exception {
        

        Calculadora cal = new Calculadora();  
        String frase = "Uno Dos TRes CuATro ";
        List<Integer> array = new ArrayList<Integer>();
        double [] array2 = {1,2,3,4};
        System.out.println("Primer metodo de palabra a numero " + cal.StringAInt("  CuAtrO   "));
        
        System.out.println( cal.StringAArray(frase));
        System.out.println(cal.reglaDe3E(array2, 100));

       
        
    }

}
