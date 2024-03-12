/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nose;
import java.math.*;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NOSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double dato1;
        System.out.println("escribe el pirmer dato");
        Scanner leerdato1 =new Scanner (System.in);
        dato1=leerdato1.nextDouble();
        
        double dato2;
        System.out.println("escribe el segundo dato");
        Scanner leerdato2 =new Scanner (System.in);
        dato2=leerdato2.nextDouble();
        
        double a,b,c,d;
        
        a=dato1+dato2;
        b=dato2-dato1;
        c=a*b;
        d=Math.pow(a,c);
        System.out.println("el resultado de la suma es"+a);
        System.out.println("el resultado de la resta es"+b);
        System.out.println("el resultado de la multiplicacion es"+c);
        System.out.println("el resultado de la potencia es"+d);
        // TODO code application logic here
   }
    
}
