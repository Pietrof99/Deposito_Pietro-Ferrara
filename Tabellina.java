import java.util.Scanner;

public class Tabellina {
public static void main(String[] args) {

    // Qua creo i due Scanner
 Scanner scanner = new Scanner(System.in);
 Scanner scannernum = new Scanner(System.in);
 int numero = 0;
 numero=scannernum.nextInt();
 int moltiplicatore=0;



// Qua inizia il nostro Ciclo che chiede numeri positivi e interi 
while (moltiplicatore<=10) {
  
System.out.println(numero +"x"+moltiplicatore);
System.out.println("Rsultato");
System.out.println(numero*moltiplicatore);
moltiplicatore++;
 
    


    
}
    
    
    
 

  scanner.close(); 
  scannernum.close(); 
}
    
 
}