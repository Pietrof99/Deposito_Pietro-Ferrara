import java.util.Random;
import java.util.Scanner;

public class MenuGiochi {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Benvenuto scegli quale gioco vuoi iniziare sui numeri ");
        System.out.println("Sono giochi sui numeri preparti ");
        System.out.println("il 1° è un memo a 5 numeri ");
        System.out.println("il 2° permette di avere la tabellina completa del numero selezionato");
        System.out.println("il 3° permette di indovinare il numero Segreto  ");
        System.out.println("1 per il primo ,2 per selezionare il secondo e 3 per il terzo ,Iniziamo");
        int sceltaGioco=0;
        sceltaGioco=scanner.nextInt();
        switch (sceltaGioco) {
            case 1:
            
        int [] numeriRandom ={2,3,3,1,2};
        int numeroUtente=0;
        int punteggo=0;
       
        Random random =new Random();
        numeriRandom[0]=random.nextInt(50)+1;
        numeriRandom[1]=random.nextInt(50)+1;
        numeriRandom[2]=random.nextInt(50)+1;
        numeriRandom[3]=random.nextInt(50)+1;
        numeriRandom[4]=random.nextInt(50)+1;
        if (numeriRandom[0]>0) {
          for (int i =0; i<numeriRandom.length; i++) {
            System.out.print(numeriRandom[i]+"  " );
            
          }
          System.out.println("Questi sono i numeri da ricordare ,Dai metticela tutta" );
          System.out.println("Ti appariranno per un paio di secondi " );
          System.out.println("Cerca di ricordarli " );

          for (int i =0; i<numeriRandom.length; i++) {
            System.out.print(numeriRandom[i]+" " ); 

          }
          System.out.println("Vediamo se li ricordi" );
          
          for (int i =0; i<numeriRandom.length; i++) {
            System.out.println("Inserisci il Numero");
            numeroUtente=scanner.nextInt();
            
            if (numeroUtente==numeriRandom[0]) {
                System.out.println("Hai indovinato il numero passiamo al successivo" );
                punteggo=punteggo +1;
            }
            if (numeroUtente==numeriRandom[1]) {
                System.out.println("Hai indovinato il numero passiamo al successivo"  );
                punteggo=punteggo +1;
            }
            if (numeroUtente==numeriRandom[2]) {
                System.out.println("Hai indovinato il numero passiamo al successivo"  );
                punteggo=punteggo +1;
            } if (numeroUtente==numeriRandom[3]) {
                System.out.println("Hai indovinato il numero passiamo al successivo"  );
                punteggo=punteggo +1;                                   
                
            }
           
          }
          System.out.print("Hai totalizzato un punteggio di :"+ " " ); 
              System.out.println(punteggo ); 
              System.out.println("E di risposte esatte" + " " ); 
              System.out.print(punteggo ); 
         

                
                break;}
        
            
                case 2:   
                System.out.println("Inserisci il numero per ottenere la sua tabellina" ); 
                // Qua creo i due Scanner
                Scanner scannertabellina = new Scanner(System.in);
                int numero = 0;
                numero=scannertabellina.nextInt();
                int moltiplicatore=0;
              
               
               
               
               // Qua inizia il nostro Ciclo che chiede numeri positivi e interi 
               while (moltiplicatore<=10) {
                 
                   System.out.println(numero +"x"+moltiplicatore);
                   System.out.println("Rsultato");
                   System.out.println(numero*moltiplicatore);
                   moltiplicatore++;
                   
                   
                }
                break;

                case 3:
                Scanner scannerString = new Scanner(System.in) ;
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
                
                 sceltaFinale=scannerString.nextLine();
                 tentativi=0;
                } while (sceltaFinale.equals("si"));
                
                System.out.println("Fine");





















    }
    scanner.close();
 }
}
