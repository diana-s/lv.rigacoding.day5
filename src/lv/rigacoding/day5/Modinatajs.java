/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day5;

import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class Modinatajs {
    
    
    
    public static void Alarm(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet nedēļas dienu(piemēram P,O,T,C,Pk,Se,Sv): ");
        String day = input.next();
        System.out.print("Norādiet: Atvaļinājums (A) vai Darba diena (D):");
        String check = input.next();
        
       if(check.equals("D")){ 
        if(day.equals("Se")||day.equals("Sv")){
            System.out.println("Modinatājs zvana 10:00");
       }
        else{
            System.out.println("Modinātājs zvana 7:00");
            
        }
   }
       if(check.equals("A")){
           if(day.equals("Se")||day.equals("Sv")){
            System.out.println("Modinatājs = OFF");
       }
        else{
            System.out.println("Modinātājs zvana 10:00");
            
        }
       }
    
    
    }
}

