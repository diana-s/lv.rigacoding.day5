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
public class FizzBuzz {
    public static void speleFizzBuzz(){
        Scanner input=new Scanner(System.in);
        System.out.print("Ievadier sākuma ciparu: ");
        int A = input.nextInt();
        System.out.print("Ievadiet beigu ciparu: ");
        int B = input.nextInt();
        
        for(int i=A; i<=B; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
               
            }
           else if(i%3==0){
                System.out.println("Fizz");
        }
           else if(i%5==0){
                System.out.println("Buzz");
    }
            
       else{
            System.out.println(String.valueOf(i));
        }
    
    }
}
}
