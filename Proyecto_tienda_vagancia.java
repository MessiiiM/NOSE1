/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tienda_vagancia;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Usuario
 */
public class Proyecto_tienda_vagancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("bienvenidos a la tienda la vagancia");
         double arroz, huevos, aceite, leche, azucar, panela,cantarroz, canthuevos,cantaceite,cantleche,cantazucar,cantpanela, total, totalarroz,totalaceite,totalhuevos,totalazucar,totalleche,totalpanela,numero;
         int x;
         arroz=3000;
         huevos=15000;
         aceite=5000;
         leche=2000;
         azucar=4000;
         panela=8000;
         
         System.out.println("ingrese la cantidad de arroz");
         Scanner leercantarroz =new Scanner (System.in);
         cantarroz=leercantarroz.nextDouble();
                 
         System.out.println("ingrese la canthuevos");
         Scanner leercanthuevos =new Scanner (System.in);
         canthuevos=leercanthuevos.nextDouble();
         
         System.out.println("ingrese la cantaceite");
         Scanner leercantaceite =new Scanner (System.in);
         cantaceite=leercantaceite.nextDouble();
         
         System.out.println("ingrese la cantleche");
         Scanner leercantleche =new Scanner (System.in);
         cantleche=leercantleche.nextDouble();
         
         System.out.println("ingrese la cantazucar");
         Scanner leercantazucar =new Scanner (System.in);
         cantazucar=leercantazucar.nextDouble();
         
         System.out.println("ingrese la cantpanela");
         Scanner leercantpanela =new Scanner (System.in);
         cantpanela=leercantpanela.nextDouble();
         
         totalarroz=arroz*cantarroz;
         totalhuevos=huevos*canthuevos;
         totalaceite=aceite*cantaceite;
         totalleche=leche*cantleche;
         totalazucar=azucar*cantazucar;
         totalpanela=panela*cantpanela;
         total=totalarroz+totalhuevos+totalaceite+totalleche+totalazucar+totalpanela;
         
         if (total>50000){
          System.out.println("Participara en una rifa por un carro 0km y el valor de la compra es "+total);
          numero=22;
         x=(int)(Math.random() *100 +1);
         System.out.println("El numero que salio es="+x);
          if (x==numero){
            System.out.println("Haz ganado la rifa de un carro 0km");
              }
          else{
            System.out.println("No ganaste el carro sigue participando");  
          }
         }
         
          else {
         System.out.println("no participas en la rifa y el total a pagar es "+total);
         
              
                  } 
         }
        // TODO code application logic here
        
       
    
    
    }
    

