package pago;

import java.util.Scanner;

public class Pago {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de 'a': ");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de 'b': ");
        double b = scanner.nextDouble();

        double resultado = expandirBinomioAlCuadrado(a, b);

        System.out.println("El resultado de (" + a + " + " + b + ")^2 es: " + resultado);
    }

    public static double expandirBinomioAlCuadrado(double a, double b) {
        double resultado = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
        return resultado;

    }

}
