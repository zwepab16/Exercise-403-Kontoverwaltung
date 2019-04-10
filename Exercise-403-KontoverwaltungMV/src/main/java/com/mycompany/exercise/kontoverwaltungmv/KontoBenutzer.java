package com.mycompany.exercise.kontoverwaltungmv;


import java.util.Random;



public class KontoBenutzer implements Runnable{

    private String name;
 

    public KontoBenutzer(String name)  {
        this.name = name;
       
    }
   
    public String toString(){
        return name;
    }

    @Override
    public void run() {
       
        while(true){
            
            Random r=new Random();
            Boolean überweisen=r.nextBoolean();
            
            if(überweisen){
                
                
            }
            
        }
        
        
        
        
    }
 
    
    
    
}
