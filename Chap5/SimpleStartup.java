package Chap5;

public class SimpleStartup {
    int[] locationCells;
    int numOfHits;


    String checkYourself(int userGuess){
    
        for(int i = 0 ; i<locationCells.length;i++){
            
            
            if(userGuess == locationCells[i]){
                numOfHits = numOfHits+1;
                System.out.println(numOfHits);
                if(numOfHits == 3){
                return "Kill";
                }
                else{
               
                    return "hit";

                }
            }
                
            
            }
               return "miss";
            }
           
     

        
    


    void setLocation(int[] locationCells){
        this.locationCells = locationCells;

    }
    
}
