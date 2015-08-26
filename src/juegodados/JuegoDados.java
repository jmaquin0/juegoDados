/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;

import java.util.Random;

/**
 *
 * @author JuanManuel
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vidas =3;
        int dado1 = 0;
        int dado2 = 0;
        Random generador= new Random();
        
        //Mientras hayan vidas hay esperanzas
        while (vidas>0){
            // se lanzan los dados y se reporta.
            dado1= generador.nextInt(6)+1;
            System.out.println("El primer dado salió: " + dado1);
            dado2= generador.nextInt(6)+1;
            System.out.println("El segundo dado salió: " + dado2);
            //si sale par gana una vida
            if (dado1==dado2){
                vidas++;
                System.out.println("Felicidades! ganaste una vida! tienes: " + vidas + " vidas");
            }//end if para par
            // de lo contrario determinemos si ganó
            else if (dado1+dado2==7){
                System.out.println("¡GANASTE!");
                break; // sale inmediatamente del juego
            }// end if ganar
            // si no ganó se le descuenta una vida
            else{
                vidas --;
            }//fin descuento de vidas
            // se le muestra un mensaje de salida;
            System.out.println("tienes " + vidas + "  intentos mas");      
        }//end while
        //muestra un mensaje
        System.out.println("juego finalizado");
        }// end main
        
        
    }
    

