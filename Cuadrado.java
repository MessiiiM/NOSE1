/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author Usuario
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lado=5;
           int base=3;
           int altura=4;
             cuadradoo cuadrado1=new cuadradoo ();
             System.out.println(cuadrado1.calcularperimetro(lado));
             
             cuadradoo cuadrado2=new cuadradoo();
            System.out.println(cuadrado2.calculararea(base,altura));
    
        // TODO code application logic here
    }
    
}
