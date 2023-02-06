
package aulas;

import java.util.Scanner;


public class aula3 {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        double grausCelsios = scanner.nextDouble();
        double fator = 1.8;
        
        double resultado = (grausCelsios * fator) + 32;
        
        System.out.println("a temperatura Fahrenheit " + resultado);
    }
}
