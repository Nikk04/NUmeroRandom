/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerorandom;


import java.util.Scanner ;

/**
 *
 * @author lorusso13462677
 */
public class NUmeroRandom {

    
    static int numero,cont = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = (int)(Math.random()*99+1);
        while(cont<10){
            System.out.println("Inserisci il numero, ho pensato da un numero da 1 a 100-- > "  + (cont++));
            
                   
                    
            numero = keyboard.nextInt();
                    
            
            if(numero==n&&cont<6){
                System.out.println("Bravo");
              
                
            }
            if(numero==n&&cont<9){
                System.out.println("potevi fare meglio");
                
            }
            if(numero==n&&cont<3){
                System.out.println("Ben fatto!!! Bravissimo");
                
         
            }
            if(numero!=n&&cont>=10){
                System.out.println("Hai perso");
                System.exit(cont);
           
            }
            if(numero != n){
                System.out.println("riprova");
            }


        }
    }
           
     
}
        
      
        

        // TODO code application logic here

   