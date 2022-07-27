

package com.mycompany.programa_ajedrez;




public class Programa_ajedrez {

    public static void main(String[] args) {
       int f;
       int c;
       
        for (c=1;c<=4;c++){
            for(f=1;f<=4;f++){
                System.out.print("#");
                System.out.print(" ");
            }
            System.out.println(" ");
            for (f=1;f<=4;f++){
                System.out.print(" ");
                System.out.print("#");
                
            }
            System.out.println(" ");
            
        }    
        
        
       
    }
}
