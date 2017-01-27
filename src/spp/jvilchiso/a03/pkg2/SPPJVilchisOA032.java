/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a03.pkg2;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPJVilchisOA032 {
Scanner keyboard = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a,b,c,d,e,f,g,pro,red;
    //Paso 2. Asignar valores a las variables.
     Scanner keyboard = new Scanner (System.in);
    System.out.println( "Introduce tu primer variable");
    a=keyboard.nextDouble();
    System.out.println( "Introduce tu segunda variable");
    b=keyboard.nextDouble();
    System.out.println( "Introduce tu tercera variable");
    c=keyboard.nextDouble();
    System.out.println( "Introduce tu cuarta variable");
    d=keyboard.nextDouble();
    System.out.println( "Introduce tu quinta variable");
    e=keyboard.nextDouble();
    System.out.println( "Introduce tu sexta variable");
    f=keyboard.nextDouble();
    System.out.println( "Introduce tu septima variable");
    g=keyboard.nextDouble();
    
    pro =  (a+b+c+d+e+f+g)/7;
    
    red= Math.round(pro);
    
        System.out.println("su promedio redondeado" + pro);
                
   
    }
    
}
