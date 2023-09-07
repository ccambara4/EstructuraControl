/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuracontrol;

/**
 *
 * @author Usuario
 */
public class EstructuraControl {

    public static void main(String[] args) {
        int calificacion = 10;
        
        /*
           Usando if else if
        */
        System.out.println("Usando IF ELSE IF");
        if (calificacion == 10) {
            System.out.println("Honor");
        } else if (calificacion == 9) {
            System.out.println("Sobresaliente");
        } else if (calificacion >= 7){
            System.out.println("Notable");
        }else if (calificacion == 6){
             System.out.println("Bien");
        } else if (calificacion == 5){
            System.out.println("Aprobado");
        } else{
            System.out.println("Suspenso");
        }
        
        /*
            Usando Swtich
        */
        
        System.out.println("\nUsando Switch");
        
        switch (calificacion) {
            case 10:
                    System.out.println("Honor");
                    break;
            case 9: 
                    System.out.println("Sobresaliente");
                    break;
            case 7:    
            case 8:
                    System.out.println("Notable");
                    break;
            case 5:
                    System.out.println("Aprobado");
                    break;
            default:
                    System.out.println("Suspenso");
                    break;
        }
        
        
    }
}
