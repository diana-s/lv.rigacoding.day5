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
public class DilstosaVirkne {
    
    public static void NumbersTillN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        int n = input.nextInt();
                
        /*(i=n sākuma pozīcija; i>=1 līdz kuram nosacījumam sistēma pārbaudīs (pildīs tik ilgi kamēr nosacījums būs patiess ; 
         i-- kādu darbību es gribu, lai sistēma veic pēc pārbaudes*/
        for(int i=n; i>=1; i--){
            System.out.print(i);
        }
    }
}

