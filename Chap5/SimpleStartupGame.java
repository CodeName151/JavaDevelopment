package Chap5;

import java.util.Scanner;

public class SimpleStartupGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleStartup game1 = new SimpleStartup();
        int[] locationCells = {0,1,2};
        
        game1.setLocation(locationCells);
        for(int i =0; i<locationCells.length; i++){
           
             System.out.println("Enter a number");
        int userGuess = sc.nextInt();

           String ans = game1.checkYourself(userGuess);
            System.out.println(ans);
        }
       
    }
    
}
