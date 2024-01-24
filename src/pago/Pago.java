package pago;

import java.util.Scanner;

public class Pago {

    public static void main(String[] args) {
        
        double a, b, Resultado,res1,res2,res3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita el valor de A : ");
        a = entrada.nextDouble();
        
        System.out.println("digita el valor de B: ");
        b=entrada.nextDouble();
        
       res1=Math.pow(a,2);
       res2=2*a*b;
       res3=Math.pow(b,2);
       Resultado =res1+res2+res3;


        
        System.out.println("Elresultado es : "+Resultado);
        
        
       
    }

}
