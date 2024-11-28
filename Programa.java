// Daniel Paredes espe poo..
package programa;

import java.util.Scanner;
public class Programa {

    
    public static void main(String[] args) {
        Programa obj = new Programa();
        
        obj.prog();
        
    }
  public void prog()  {
      Scanner sc = new Scanner (System.in);
      System.out.println("ingrese primer numero =");
      double x = sc.nextDouble();
      
      System.out.println("ingrese segundo numero =");
      double y = sc.nextDouble();
      calculadora obj = new calculadora ();
         System.out.println("La suma es=" +obj.suma(x, y));
      System.out.println("La resta es=" +obj.resta(x, y));
      System.out.println("el producto es =" +obj.multi(x, y));
      System.out.println("el cociente es=" +obj.division(x, y));
      
  }
}
