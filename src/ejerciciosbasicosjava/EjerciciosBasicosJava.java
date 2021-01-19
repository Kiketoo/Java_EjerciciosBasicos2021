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

    }

}
