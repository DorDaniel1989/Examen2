package core;  

    import java.util.ArrayList;
    import java.util.List;
public class Calculadora {
  
    
    public int StringAInt(String num){
        
       
        String entero=num.trim().toLowerCase();
        
        if (entero.equalsIgnoreCase("uno")) {
            return 1; 
         }
         if (entero.equalsIgnoreCase("dos")) {
            return 2; 
         }
         if (entero.equalsIgnoreCase("tres")) {
            return 3; 
         }
         if (entero.equalsIgnoreCase("cuatro")) {
            return 4; 
         }
         if (entero.equalsIgnoreCase("cinco")) {
            return 5; 
         }
         if (entero.equalsIgnoreCase("seis")) {
            return 6; 
         }  
         if (entero.equalsIgnoreCase("siete")) {
            return 7; 
         }       
         if (entero.equalsIgnoreCase("ocho")) {
            return 8; 
         }       
         if (entero.equalsIgnoreCase("9")) {
            return 9; 
         }       
             
        return 0;
    }


    public List<Integer> StringAArray(String s){
        List<Integer> list = new ArrayList<Integer>();
       
        String[] palabras=s.trim().split("\\s+");
        list = new ArrayList<Integer>();;
       


       for(int i=0;i<palabras.length; i++){
           list.add(StringAInt(palabras[i]));
       }
       
       return list;
    }


    public double[] reglaDe3E(double[] array, int valor){
        double[] regla3=new double[10];
        int suma=0;
        for(int i=0; i<array.length; i++)
        suma+=array[i];
        
        for(int i=0; i<array.length; i++){
        double nuevoValor=(array[i]*valor)/suma;
              regla3[i]=nuevoValor;
            
        }
        return regla3;
     }

  
 


    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
}
