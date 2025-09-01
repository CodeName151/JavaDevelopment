package Chap4;

import DogText.Dog;

public class Methods {
    private int size = 10;
    void dog(){
        System.out.println("Woof Woof.....");
    }
    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }
    public static void main(String[] args) {

        Methods dog1 = new Methods();
        dog1.setSize(20);
      int dog1Size =  dog1.getSize();
      System.out.println("Dog size is : " + dog1Size);
        
    }
    
}
