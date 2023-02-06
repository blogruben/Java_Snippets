
package org.ruben.java.invocacion;



public class App {

    public static void main(String[] args)  {
        
        System.out.println("Inicio");
        long startTime = System.nanoTime();
        Trazar otra = new Trazar();
        for (int i = 0; i < 1000000; i++) {
            //otra.quienMeLLama();
            otra.quienMeLLama(App.class);
            //System.out.println("wsfrssdfd");
        }
        //LlamarClase.llamar();
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Fin");
        //System.out.println("tiempo:"+elapsedTime+"nano segundo");
        System.out.println("tiempo:"+elapsedTime/1000000+"ms");

    }











    
}
