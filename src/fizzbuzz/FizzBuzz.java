
package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    private List<Par> pares;
      private List<String>FB;
      
   public int pedirNumero(){
   Scanner entrada=new Scanner(System.in);
       System.out.println("Introduce el numero:");
   int x=Integer.parseInt(entrada.nextLine().trim());
   return x;}   
      
   public List<Par> FizzBuzz(int n){
   pares= new ArrayList<>(n);
   FB=new ArrayList<>(2);
   for (int i=1;i<=n;i++){
     FB.clear();
   if(i%3==0){
     FB.add("Fizz ");
   }
   if(i%5==0){
     FB.add("Buzz");
   }
   if(i%3==0 || i%5==0){
        Par e= new Par<>(i,FB);
       pares.add(e);}
   }
   return pares;}
   
   
}
