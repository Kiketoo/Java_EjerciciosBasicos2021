/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author kikee
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        
        //si es finde no hay limite de bellotas asique da igual cuantas haya
        if(finDeSemana){
            return true;
        }
        //si llega aqui es que no es findesemana
        
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    /**
     * multa:
     */
    public int multa (int velocidad, boolean birthday){
        //si es tu cumpleaños, le resta 5 a la velocidad
        if (birthday){
            velocidad = velocidad - 5; //velocidad -=5;
        }
        //si va a menos de 60 por hora
        if (velocidad <= 60){
            return 0; //no hay multa
        } 
        //si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80){
            return 1; //multa pequeña
        }
        //en cualquier otro valor 
        return 2;
    }
    /**
     * 
     * @param numero para evaluar si es o no vanidoso
     * es vanidoso si es multiplo de 11 o multiplo + 1
     * @return 
     */
    public boolean muyVanidoso(int numero){
        if (numero % 11 <= 1){//si ladivisión da resto cero o uno
            return true;
        }
        return false;
    }
    public boolean contesta (boolean matinal, boolean madre, boolean dormido){
    if (matinal){
        if(madre){
            return true;
        }
        else{
            return false;
        }
    }
    if (dormido){
        return false;
    }
    
    return true;
    }
    public boolean menorPor (int a, int b, int c){
        if (a-b==10 || a-c == 10 || b-c==10){
            return true;
        }
        if ( b-a==10 || c-a==10 || c-b==10){
            return true;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de l clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        System.out.println( ejercicio.fiestaArdillas(30, false));
        System.out.println( ejercicio.fiestaArdillas(50, false));
        System.out.println( ejercicio.fiestaArdillas(70, true));
    
        System.out.println("Ejercicio 02 multa:");
        System.out.println( ejercicio.multa(60, false));
        System.out.println( ejercicio.multa(65, false));
        System.out.println( ejercicio.multa(65, true));

        System.out.println("Ejercicio 03 muyVanidoso:");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
         System.out.println("Ejercicio 04 contesta:");
        System.out.println(ejercicio.contesta(false,false,false));
        System.out.println(ejercicio.contesta(false,false,true));
        System.out.println(ejercicio.contesta(true,false,false));

          System.out.println("Ejercicio 05 menorPor:");
        System.out.println(ejercicio.menorPor(1, 7, 11));
        System.out.println(ejercicio.menorPor(1, 7, 10));
        System.out.println(ejercicio.menorPor(11, 1, 7));

    }

}
