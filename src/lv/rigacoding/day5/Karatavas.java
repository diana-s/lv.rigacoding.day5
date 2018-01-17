/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class Karatavas {
        
    private static ArrayList<String>Words;
    
    public static String GetWord(){
        Words= new ArrayList<String>();
        Words.add("OSLO");
        Words.add("LONDON");
        Words.add("RIGA");
        Words.add("MOSCOW");
        Words.add("ROME");
        Words.add("BERLIN");
        return null;
        
    }
    public void shuffle(){
        Collections.shuffle(Words);
        
    }
    public String FindWord(){
        String firstWord = Words.get(0);
        return firstWord;
                
    }
   public void GetLetter(){
        String n = FindWord();
        
        for(int i=0; i<n.length(); i++);
        System.out.print("_");
     
     Scanner input = new Scanner(System.in);
     System.out.print("Ievadiet burtu: ");
     String letter = input.next();
     
     //while(n.contains(letter)){
     if(n=="OSLO" && letter=="O"){
         System.out.print("O__O");
        }
     else if(n=="OSLO" && letter=="S"){
         System.out.print("_S__");
     }
     else if(n=="OSLO" && letter=="L"){
         System.out.print("__L_");
     }
     else{
         System.out.print("Šis vārds nesatur burtu "+ letter+ ".Miniet vēlreiz");
         //break;
     }
        
   }
    
    
}
