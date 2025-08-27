package Chap1;
import java.util.random.RandomGenerator;

public class PhaseOMatic {
    public static void main(String[] args) {

        //Documentation:
        //This is a random Phrase Generator (Phrase O Matic)
        //given words to create some interesting phrases

        
        //We First Give a Counter Just In case
        int count = 1;

        //Declared 3 String arrays containing random words
        String[] set1 =  {"Great" , "Terrific" , "Sound" , "Brave"};
        String[] set2 = {"Leader" , "Conquerer" , "Soldier" , "Warrior"};
        String[] set3 = {"Shayan" , "Rafay" , "Umar" , "Ali"};

        //We take lengths of these arrays because we can lol
        int length1 = set1.length;
        int length2 = set2.length;
        int length3 = set3.length;

        //loop (10 times)
        for(int i = 0 ; i<10 ; i++){

            //Generating random numbers according to array lengths and passing them as indexes
            java.util.Random RandomGenerator = new java.util.Random();
                int random1 = RandomGenerator.nextInt(length1);
                int random2 = RandomGenerator.nextInt(length2);
                int random3 = RandomGenerator.nextInt(length3);

            //Refractoring and indenting the words from the String Array to a phrase variable
            String phrase = set1[random1] + " " + set2[random2] + " " + set3[random3] + " ";   
    
            //Printing the phrase with the counter we had...
            System.out.println("Phrase "+ count + " is : " + phrase);
            count++;
        }
    }
}
