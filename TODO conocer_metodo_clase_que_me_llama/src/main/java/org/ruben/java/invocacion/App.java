
package org.ruben.java.invocacion;



public class App {

    public static void main(String[] args)  {
        System.out.println("Inicio");
        
        Trazar otra = new Trazar();
        otra.quienMeLLama();
        LlamarClase.llamar();
        System.out.println("Fin");

    }











    
}
