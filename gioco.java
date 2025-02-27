import java.util.Random;
import java.util.Scanner;

public class gioco {
    
    
    public static void main(String[] args) {
        
    // Creazione Oggetto Scan per le stringhe di testo e per gli interi 
    
 Scanner scanner = new Scanner(System.in) ;
 Scanner scannerNum= new Scanner(System.in);
 int numeroSegreto=0;
 int numeroScelto=0;
 Random numRandom=new Random();
 String sceltaFinale ="si";
 int tentativi =0;

 
 do {
      // Creazione numero Random per il gioco ad indovinello
    numeroSegreto=numRandom.nextInt(100)+1;
  System.out.println("Prova ad indovinare il numero da 1 a 100  , Buon Divertimento");
  numeroScelto=scannerNum.nextInt();
  
  if (numeroScelto>0&&numeroScelto<101) {
    while (numeroSegreto!=numeroScelto) {
        tentativi++;
        System.out.println("Tentativo n°" + tentativi);
        if (numeroSegreto>numeroScelto) {
            System.out.println("Il numero segreto è piu alto, Dai ritenta ");
         
        }
        else if (numeroSegreto<numeroScelto) {
            if (numeroScelto-numeroSegreto<10) {
                System.out.println("Hai superato il numero segreto, ma sei vicino");

                
                
            }
            else if (numeroScelto-numeroSegreto<=30) {
                System.out.println("Hai superato il numero segreto ma non sei molto lontano");
                
            }
            else if (numeroScelto-numeroSegreto>=50) {
                System.out.println("Hai superato il numero segreto e sei molto lontano");
                
            }
            else{

            }
            
        }

        else{
            System.out.println("Hai superato il numero segreto");

        }
        System.out.println("Dai ritenta");
        numeroScelto=scannerNum.nextInt();
        
        
    }
    
        if (numeroScelto==numeroSegreto)  {
            System.out.println("HAI VINTO CONGRATULAZIONI!!");
            
        }
          
  }
  else{
    System.out.println("Numero non valido, deve essere un numero positivo compreso tra 1 e 100 ,Ritenta");
    

  }
  
  System.out.println("vuoi Rigiocare?? ? si/no");
 
  sceltaFinale=scanner.nextLine();
  tentativi=0;
     // Ti da la possibilità di uscire o rifare il gioco
 } while (sceltaFinale.equals("si"));
 
 System.out.println("Fine");
 scanner.close();
 scannerNum.close();
 
 }
 }


















 
    


  
 
 
 
 



  
  
   
   
  
     
     
  
  
   
  
  
  
  
              
  
             
              
          
  
      
      
  
  
  
  
  
  
  
  
  
  
    

      

  
      
 


