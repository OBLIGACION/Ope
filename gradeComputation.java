/*DATA STRUCTURE AND ALGORHITMS (using return value) Grade Calculation */
import java.util. Scanner;
public class Main {

  public static void main(String[] args) {
  
  Scanner back = new Scanner(System.in);
  
   int PG1,PG2,PG3,PG4,PG5,PG6;
   int AVERAGE;
   
   PG1 = back.nextInt();
   PG2 = back.nextInt();
   PG3 = back.nextInt();
   PG4 = back.nextInt();
   PG5 = back.nextInt();
   PG6 = back.nextInt();
   AVERAGE = (PG1+PG2+PG3+PG4+PG5+PG6)/6;
   
   if(AVERAGE < 75) {
     System.out.println("FAIL");
   } else {
       System.out.println("PASSED");
     }
  }
}
