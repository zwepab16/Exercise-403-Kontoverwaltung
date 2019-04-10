package com.mycompany.exercise.kontoverwaltungmv;


import java.util.Random;
import javax.swing.JList;
import javax.swing.JTextArea;



public class KontoBenutzer implements Runnable{

    private String name;
    private Konto k;
    private JTextArea log;
 

    public KontoBenutzer(String name,Konto k,JTextArea log)  {
        this.name = name;
        this.k=k;
        this.log=log;
    }
   
    public String toString(){
        return name;
    }

    @Override
    public void run() {
        
        for(int i=0;i<10;i++){
            
            Random r=new Random();
            Boolean überweisen=r.nextBoolean();
            
            int geld=r.nextInt(50-10+1)+10;
            if(überweisen){
                k.überweisen(geld);
               log.append(String.format("%s: überweist %d ---> %d", name));
                System.out.println(name+": "+"Geld überweisen!"+k.getSaldo());
                
            }
            else if (k.getSaldo()-geld>=0){
               k.abheben(geld);
               System.out.println(name+": "+"Geld abheben!"+k.getSaldo());
            }
            else{
                System.out.println(name+": "+"Zu wenig geld!"+k.getSaldo());
            }
            
        }
        
        
        
        
    }
 
    
    
    
}
