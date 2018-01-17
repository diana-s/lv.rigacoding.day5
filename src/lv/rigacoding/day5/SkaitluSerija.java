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
public class SkaitluSerija {
    public static void Nnumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadiet, lūdzu vērtību N: ");
        int n = input.nextInt();
        
       
        for(int i=1; i<=n; i=i+1){
            for(int j=1;j<=i; j++){
                System.out.print(j);
            }
            
        }
    }
}
