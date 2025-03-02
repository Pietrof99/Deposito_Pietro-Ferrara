import java.util.Random;
import java.util.Scanner;

public class Memo5 {
    public static void main(String[] args) {
        int [] numeriRandom ={2,3,3,1,2};
        int numeroUtente=0;
        int punteggo=0;
        Scanner scanner =new Scanner(System.in);
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
         


          
          

        }
        
        scanner.close();
    }

}
