import java.util.Scanner;

public class Ciclo  {
public static void main(String[] args) {

    // Qua creo i due Scanner
 Scanner scanner = new Scanner(System.in);
 Scanner scannernum = new Scanner(System.in);
 int numero=0;
 int somma= 0;

// Qua inizia il nostro Ciclo che chiede numeri positivi e interi 
 while (numero>=0) {

    System.out.println("Inserisci un numero intero e positivo ");
     numero =scannernum.nextInt();
    

     if (numero>=0) {
        somma=somma+numero;
 }
     else{
     System.out.println("La somma dei numeri positivi è ");
     System.out.println(somma);
     break;
     
        

    
        

     }
    
    
    
    
 }

  scanner.close(); 
  scannernum.close(); 
}
    
 
}
