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
public class Acite {
    public static void Blackjack(){
    Scanner input = new Scanner(System.in);
    System.out.print("Ievadiet pirmo skaitli: ");
    int skaitlis = input.nextInt();
    System.out.print("Ievadiet otru skaitli: ");
    int skaitlis2 = input.nextInt();
    
    if(skaitlis>21 && skaitlis2>21){
        System.out.println("0");
    }
    else if(skaitlis>21){
        System.out.println("Jūsu ievadītais skaitlis: "+skaitlis2+" ir vistuvākais Acītes vērtībai");
    }
    else if(skaitlis2>21){
        System.out.println("Jūsu ievadītais skaitlis: "+skaitlis+" ir vistuvākais Acītes vērtībai");
    }
    else if(skaitlis==skaitlis2)
         System.out.println("0");
        
    else{
    if(skaitlis>skaitlis2){
        System.out.println("Jūsu ievadītais skaitlis: "+skaitlis+" ir vistuvākais Acītes vērtībai");
    }
   
    else if (skaitlis2>skaitlis){
        System.out.println("Jūsu ievadītais skaitlis: "+skaitlis2+" ir vistuvākais Acītes vērtībai");
    }
    
    
}
    }
    
    
}
