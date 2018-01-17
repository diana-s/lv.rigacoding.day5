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
public class AtrumaParkapejs {
    
    public static void SpeedControl(){
    Scanner input = new Scanner(System.in);
    System.out.print("Ievadiet Jūsu braukšanas ātrumu: ");
    int speed = input.nextInt();
    System.out.print("Vai šodien ir Tava dzimšanas diena(Yes vai No): ");
    String bday = input.next();
   
    
    if(bday.equals("No")){
        if(speed<=60){
            System.out.println("Jums nav soda punkti. Brauciet droši tālāk!");
        }
        if(speed>=61 && speed<=80){
            System.out.println("Jums ir pārsniegts ātrums. Jums tiek piešķirts 1 soda punkts");
        }
        if(speed>=81){
            System.out.println("Jums ir pārsniegts ātrums. Jums tiek piešķirti 2 soda punkti");
        }
    }
    
    else if(bday.equals("Yes")){
        if(speed<=65){
            System.out.println("Jums nav soda punkti. Brauciet droši tālāk!");
        }
        if(speed>=66 && speed<=85){
            System.out.println("Jums ir pārsniegts ātrums. Jums tiek piešķirts 1 soda punkts");
        }
        if(speed>=86){
            System.out.println("Jums ir pārsniegts ātrums. Jums tiek piešķirti 2 soda punkti");
        }
    }
    
    
    
    }
    
    
}
